import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n ; i++) {
			StringTokenizer tkn = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(tkn.nextToken());
			int b = Integer.parseInt(tkn.nextToken());
			
			sb.append(a + b + "\n");
		}
		
		System.out.println(sb.toString());
		
	}
}