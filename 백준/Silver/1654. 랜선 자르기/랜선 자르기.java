import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(tkn.nextToken());
		int n = Integer.parseInt(tkn.nextToken());
		int[] lines = new int[k];
		
		lines[0] = Integer.parseInt(br.readLine());
		int maxLength = lines[0];
		
		for (int i = 1; i < k; i++) {
			lines[i] = Integer.parseInt(br.readLine());
			if (lines[i] > maxLength) {
				maxLength = lines[i];
			}
		}
		
		long result = binarySearch(lines, maxLength, n);
		
		System.out.println(result);
		
	}
	
	private static long binarySearch (int[] lines, int maxLength, int target) {
		long left = 1;
		long right = maxLength;
		
		List<Long> candidates = new ArrayList<>();
		
		while (left <= right) {
			long mid = (left + right) / 2;
			
			if (getLineCnt(lines, mid) < target) {
				right = mid - 1;
				
			} else if (getLineCnt(lines, mid) >= target) {
				candidates.add(mid);
				left = mid + 1;
			} 
		}
		
		Collections.sort(candidates, Collections.reverseOrder());
		
		return candidates.get(0);
	}
	
	private static int getLineCnt(int[] lines, long cutLength) {
		int lineCnt = 0;
		
		for (int i = 0; i < lines.length; i++) {
			lineCnt += (long) lines[i] / cutLength;
		}
		
		return lineCnt;
	}
}
