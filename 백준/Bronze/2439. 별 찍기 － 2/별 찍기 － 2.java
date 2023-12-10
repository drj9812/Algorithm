import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int spaces = n - i - 1;
			int stars = i + 1;

			for (int j = 0; j < spaces; j++) {
				bw.write(" ");
			}
			
			for (int k = 0; k < stars; k++) {
				bw.write("*");
			}
			
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}