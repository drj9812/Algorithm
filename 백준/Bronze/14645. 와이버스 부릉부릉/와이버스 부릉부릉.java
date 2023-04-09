import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(tkn.nextToken());
		int m = Integer.parseInt(tkn.nextToken());
		
		for (int i = 0; i < n; i++) {
			tkn = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int a = Integer.parseInt(tkn.nextToken());
			}
		}
		
		System.out.println("비와이");
	}
}