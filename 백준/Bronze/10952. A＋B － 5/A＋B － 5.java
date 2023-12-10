import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer tkn;

		int sum = 0;

		while (true) {
			tkn = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(tkn.nextToken());
			int b = Integer.parseInt(tkn.nextToken());

			sum = a + b;

			if (a == 0 && b == 0) {
				break;
			}
			
			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}