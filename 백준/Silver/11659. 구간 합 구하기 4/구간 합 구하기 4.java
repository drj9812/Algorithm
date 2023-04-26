import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(tkn.nextToken());
		int[] input = new int[n];
		int s = Integer.parseInt(tkn.nextToken());

		tkn = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(tkn.nextToken());
		}

		int[] prefixSum = getPrefixSum(input);
		
		for (int i = 0; i < s; i++) {
			tkn = new StringTokenizer(br.readLine());
			int startIndex = Integer.parseInt(tkn.nextToken());
			int endIndex = Integer.parseInt(tkn.nextToken());

			int intervalSum = getIntervalSum(prefixSum, startIndex, endIndex);
			System.out.println(intervalSum);
		}
	}

	private static int[] getPrefixSum(int[] input) {
		int[] prefixSum = new int[input.length];
		prefixSum[0] = input[0];

		for (int i = 1; i < input.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + input[i];
		}

		return prefixSum;
	}

	private static int getIntervalSum(int[] prefixSum, int startIndex, int endIndex) {
		if (startIndex == 1) {
		    return prefixSum[endIndex - 1];
		}

		return prefixSum[endIndex - 1] - prefixSum[startIndex - 2];
	}
}