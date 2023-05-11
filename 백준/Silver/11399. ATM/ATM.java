import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] p = new int[n];
		
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < p.length; i++) {
			p[i] = Integer.parseInt(tkn.nextToken());
		}
		
		Arrays.sort(p);
		int sum = 0;
		
		for (int j = 0; j < p.length; j++) {
			for (int k = 0; k <= j; k++) {
				sum += p[k];
			}
		}	
		System.out.println(sum);
	}
}
