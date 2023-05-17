import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(tkn.nextToken());
		int k = Integer.parseInt(tkn.nextToken());
		int[] baskets = new int[k];

		for (int i = 0; i < baskets.length; i++) {
			baskets[i] = i + 1;
			n -= baskets[i];
		}

		if (n < 0) {
			System.out.println(-1);
		} else if (n == 0) {
			System.out.println(baskets[baskets.length - 1] - baskets[0]);
		} else {

			if (n % baskets.length == 0) {
				System.out.println(baskets[baskets.length - 1] - baskets[0]);
			} else {

				int cnt = n / baskets.length;

				for (int j = 0; j < cnt; j++) {
					for (int m = 0; m < baskets.length; m++) {
						baskets[m] += 1;
						n -= 1;
					}
				}

				baskets[baskets.length - n] += n;

				Arrays.sort(baskets);

				System.out.println(baskets[baskets.length - 1] - baskets[0]);

			}
		}
	}
}