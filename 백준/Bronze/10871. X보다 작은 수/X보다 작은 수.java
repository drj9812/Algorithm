import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(tkn.nextToken());
		int[] nArray = new int[n];

		int x = Integer.parseInt(tkn.nextToken());
		tkn = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			nArray[i] = Integer.parseInt(tkn.nextToken());
		
			if (nArray[i] < x) {
				sb.append(nArray[i] + " ");
			}
		}
		
		System.out.println(sb.toString());
	}
}