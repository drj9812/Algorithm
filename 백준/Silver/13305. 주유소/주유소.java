import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] cityDistances = new int[n - 1];
		int[] pricesPerLiter = new int[n];

		StringTokenizer tkn = new StringTokenizer(br.readLine());
		StringTokenizer tkn1 = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			if (i < n - 1) {
				cityDistances[i] = Integer.parseInt(tkn.nextToken());
			}
			pricesPerLiter[i] = Integer.parseInt(tkn1.nextToken());
		}

		long minSum = (long) cityDistances[0] * pricesPerLiter[0];

		for (int j = 1; j < pricesPerLiter.length - 1; j++) {
			if (pricesPerLiter[j] > pricesPerLiter[j - 1]) {
				minSum += cityDistances[j] * pricesPerLiter[j - 1];
			} else {
				minSum += cityDistances[j] * pricesPerLiter[j];
			}
		}
		
		System.out.println(minSum);
	}
}
