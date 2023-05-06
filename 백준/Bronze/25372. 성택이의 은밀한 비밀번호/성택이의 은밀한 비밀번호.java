import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] passwords = new String[n];
				
		for (int i = 0; i < n; i++) {
			passwords[i] = br.readLine();
		}
		
		for (String x : passwords) {
			if (x.length() >= 6 && x.length() <= 9) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
