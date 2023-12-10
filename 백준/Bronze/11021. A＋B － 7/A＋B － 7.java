import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer tkn;
		
		int t = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for (int i = 1; i <= t; i++) {
			tkn = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(tkn.nextToken());
			int b = Integer.parseInt(tkn.nextToken());
			
			sum = a + b;
			
			bw.write("Case #" + i + ": " + sum + "\n");
		}
		bw.flush();
		bw.close();		
	}
}