import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n  = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
		
		for (int i = 0; i < 2; i++) {
			StringTokenizer tkn = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				if (i == 0) {
					a[j] = Integer.parseInt(tkn.nextToken());
				} else {
					b[j] = Integer.parseInt(tkn.nextToken());
				}
			}
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += a[i] * b[n - 1 - i];
		}
		
		System.out.println(sum);
	}
}
