import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= l; i++) {
			a -= c;
			b -= d;
			if (a <= 0 && b <= 0) {
				System.out.println(l - i);
				break;
			}
		}
	}
}