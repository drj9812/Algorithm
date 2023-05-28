import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long s = Long.parseLong(br.readLine());
		long sum = 0;
		int cnt = 0;
		
		for (long i = 1;; i++) {
			if (sum + i > s) {
				System.out.println(cnt);
				break;
			} else {
				sum += i;
				cnt++;
			}
		}
	}
}
