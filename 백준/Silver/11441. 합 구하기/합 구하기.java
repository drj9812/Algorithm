import java.io.*;
import java.util.StringTokenizer;	

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] sequence = new int[n];
		
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			sequence[i] = Integer.parseInt(tkn.nextToken());
		}
		
		int[] prefixSum = getPrefixSum(sequence);
		
		int m = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < m; i++) {
			tkn = new StringTokenizer(br.readLine());
			
			int left = Integer.parseInt(tkn.nextToken());
			int right = Integer.parseInt(tkn.nextToken());
			int intervalSum  = getIntervalSum(prefixSum, left, right);
			
			System.out.println(intervalSum);
		}
		
	}
	
	private static int[] getPrefixSum(int[] sequence) {
		int[] prefixSum = new int[sequence.length];
		prefixSum[0] = sequence[0];
		
		for (int i = 1; i < sequence.length; i++) {
			prefixSum[i] =  prefixSum[i - 1] + sequence[i];
		}
		return prefixSum;
	}
	
	private static int getIntervalSum(int[] prefixSum, int left, int right) {
		if (left == 1) {
			return prefixSum[right - 1];
		}
		
		return prefixSum[right- 1] - prefixSum[left - 2];
	}
}
