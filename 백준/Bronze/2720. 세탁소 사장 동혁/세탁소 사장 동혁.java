import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int[] iArr = new int[4];
			
			while (n != 0) {
				if (n >= quarter) {
					iArr[0] = n / quarter;
					n = n - (n / quarter) * quarter;
				} else if (n >= dime) {
					iArr[1] = n / dime;
					n = n - (n / dime) * dime;
				} else if (n >= nickel) {
					iArr[2] = n / nickel;
					n = n - (n / nickel) * nickel;
				} else if (n >= penny) {
					iArr[3] = n / penny;
					n = n - (n / penny) * penny;
				}
			}
			for (int j = 0; j < iArr.length; j++) {
				System.out.print(iArr[j] + " ");
			}
			System.out.println();
		}
	}
}