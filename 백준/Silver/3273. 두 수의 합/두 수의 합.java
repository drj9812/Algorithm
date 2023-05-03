import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] sequence = new int[n];
		
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = Integer.parseInt(tkn.nextToken());
		}
		
		Arrays.sort(sequence);
		
		int x = Integer.parseInt(br.readLine());
		
		int pairCnt = twoPointer(sequence, x);
		
		System.out.println(pairCnt);
	}
	
	private static int twoPointer(int[] sequence, int target) {
		int left = 0;
		int right = sequence.length - 1;
		
		int pairCnt = 0;
		
		while (left < right) {
			if (sequence[left] + sequence[right] > target) {
				right--;
				
			} else if (sequence[left] + sequence[right] < target) {
				left++;

			} else if (sequence[left] + sequence[right] == target) {
				pairCnt++;
				right--;
				left++;
			}	
		}
		return pairCnt;
	}
}