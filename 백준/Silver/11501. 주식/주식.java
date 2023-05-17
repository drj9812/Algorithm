import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		long sum = 0;
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int[] prices = new int[n];
			
			StringTokenizer tkn = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < n; j++) {
				prices[j] = Integer.parseInt(tkn.nextToken());
			}
			
			int maxPrice = prices[n - 1];

            for (int k = n - 2; k >= 0; k--) {
                if (prices[k] > maxPrice) {
                    maxPrice = prices[k];
                } else {
                    sum += maxPrice - prices[k];
                }
            }
			 sb.append(sum).append("\n");
			 sum = 0;
        }
        System.out.println(sb.toString());
	}
}
