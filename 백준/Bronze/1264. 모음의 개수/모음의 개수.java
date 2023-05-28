import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String input = br.readLine();
			if (input.equals("#")) {
				break;
			}
			String[] sArr = input.split("");

			int cnt = 0;

			for (int i = 0; i < sArr.length; i++) {
				switch (sArr[i].toLowerCase()) {
				case "a":
					cnt++;
					break;
				case "e" :
				cnt++;
				break;
				case "i" :
				cnt++;
				break;
				case "o" :
				cnt++;
				break;
				case "u" :
				cnt++;
				break;
				}
			}
			System.out.println(cnt);
		}
	}
}