import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(tkn.nextToken());
		int[] sequence = new int[n];
		int m = Integer.parseInt(tkn.nextToken());
		
		tkn = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = Integer.parseInt(tkn.nextToken());
		}
		
		int[] prefixSum = getPrefixSum(sequence);
		
		int shortestLength = twoPointer(prefixSum, m);
		
		System.out.println(shortestLength);
		
	}
	private static int[] getPrefixSum(int[] sequence) {
		int[] prefixSum = new int[sequence.length];
		prefixSum[0] = sequence[0];
		
		for (int i = 1; i < prefixSum.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + sequence[i];
		}
		
		return prefixSum;
	}
	
	private static int getIntervalSum(int[] prefixSum, int left, int right) {
		if (left == 1) {
			return prefixSum[right - 1];
		}
		
		return prefixSum[right - 1] - prefixSum[left - 2];
	}
	
	private static int twoPointer(int[] prefixSum, int target) {
		int left = 1;
		int right = 1;
		
		ArrayList<Integer> overSums = new ArrayList<>();
		
		while (right <= prefixSum.length) {
			if (getIntervalSum(prefixSum, left, right) < target) {
				right++;
			} else if (getIntervalSum(prefixSum, left, right) >= target) {
				overSums.add(right - left + 1);
				left++;
			}
		}
		
		Collections.sort(overSums);

		if (overSums.size() == 0) {
			return 0;
		} 
		
		return overSums.get(0);
	}
}