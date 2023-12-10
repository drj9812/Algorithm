import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			StringTokenizer tkn = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(tkn.nextToken());
			int b = Integer.parseInt(tkn.nextToken());
			
			sum = a + b;
			
			bw.write(sum + "\n");
		}
        br.close();
		bw.flush();
		bw.close();
	}
}