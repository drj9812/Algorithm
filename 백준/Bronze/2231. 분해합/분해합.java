import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i <= n; i++) {
			int sum = i;
			int temp = i;
			
			while (temp != 0) {
				sum += temp % 10;
				temp /= 10;
			}
			if(sum == n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}
