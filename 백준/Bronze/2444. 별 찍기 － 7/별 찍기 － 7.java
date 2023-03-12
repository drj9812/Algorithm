import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= a; i++) {
//			System.out.println();
			for (int j = 0; j < a; j++) {
				if (j != a - i) {
					System.out.print(" ");
				} else {
					for (int k = 1; k <= 2 * i - 1; k++) {
						System.out.print("*");
					}
					break;
				}
			}
			System.out.println();
		}
		for (int l = 1; l <= a - 1; l++) {
//			System.out.println();
			for (int m = 0; m < l; m++) {
				System.out.print(" ");
			}
			for (int n = 2 * (a - l) - 1; n > 0; n--) {
				System.out.print("*");
			}
			if (l != a) {
				System.out.println();
			}
		}
	}
}