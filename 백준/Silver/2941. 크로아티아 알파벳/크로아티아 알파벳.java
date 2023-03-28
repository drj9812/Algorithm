import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = 0;
		int cnt = 0;

		String str = br.readLine();
		String[] sArr = str.split("");

		for (int i = 0; i <= sArr.length - 3; i++) {
			if ((sArr[i] + sArr[i + 1] + sArr[i + 2]).equals("dz=")) {
				length += 3;
				cnt++;
				sArr[i] = "";
				sArr[i + 1] = "";
				sArr[i + 2] = "";
			}
		}
		for (int j = 0; j < sArr.length - 1; j++) {
			switch (sArr[j] + sArr[j + 1]) {
			case "dz=":
				length += 2;
				cnt++;
				break;
			case "c=":
				length += 2;
				cnt++;
				break;
			case "c-":
				length += 2;
				cnt++;
				break;
			case "d-":
				length += 2;
				cnt++;
				break;
			case "lj":
				length += 2;
				cnt++;
				break;
			case "nj":
				length += 2;
				cnt++;
				break;
			case "s=":
				length += 2;
				cnt++;
				break;
			case "z=":
				length += 2;
				cnt++;
				break;
			}
		}
		System.out.println(sArr.length - length + cnt);
	}
}