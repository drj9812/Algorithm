import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			String input = br.readLine();
			sb.append(i + ". " + input + "\n");
		}
		
		System.out.println(sb);
		
	}
}
