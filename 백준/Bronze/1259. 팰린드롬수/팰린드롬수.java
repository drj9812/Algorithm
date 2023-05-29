import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String input = br.readLine();

			if (input.equals("0")) {
				break;
			}

			String[] sArr = input.split("");
			int cnt = 0;

			for (int i = 1; i <= sArr.length / 2; i++) {
				if (sArr[i - 1].equals(sArr[sArr.length - i])) {
					cnt++;
				}
			}
			if (cnt == sArr.length / 2) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}