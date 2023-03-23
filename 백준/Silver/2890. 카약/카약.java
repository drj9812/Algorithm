import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(str.nextToken());
		int c = Integer.parseInt(str.nextToken());
		String[][] sArr = new String[r][c];
		int[] iArr = new int[9];

		int rank = 0;

		for (int i = 0; i < r; i++) {
			String str1 = br.readLine();
			sArr[i] = str1.split("");
		}

		for (int k = c - 2; k > 0; k--) {
			for (int l = 0; l < r; l++) {
				if (!sArr[l][k].equals(".") && iArr[Integer.parseInt(sArr[l][k]) - 1] != 0) {
					continue;
				} else if (!sArr[l][k].equals(".")) {
					rank++;
					iArr[Integer.parseInt(sArr[l][k]) - 1] = rank;
					for (int m = 0; m < r; m++) {
						if (!sArr[m][k].equals(".") && iArr[Integer.parseInt(sArr[m][k]) - 1] != 0) {
							continue;
						} else if (!sArr[m][k].equals(".")) {
							iArr[Integer.parseInt(sArr[m][k]) - 1] = iArr[Integer.parseInt(sArr[l][k]) - 1];
						}
					}
				}
			}
		}
		for (int i = 0 ; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}
}