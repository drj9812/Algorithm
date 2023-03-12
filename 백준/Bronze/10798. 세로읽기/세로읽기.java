import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[][] sArr = new String[5][15];
			String o = "";
			for (int i = 0; i < sArr.length; i++) {
				String str = br.readLine();
				String[] sArr1 = str.split("");
				for (int j = 0; j < sArr1.length; j++) {
					sArr[i][j] = sArr1[j];
			}
		}
			for (int k = 0; k < 15; k++) {
				for (int l = 0; l < sArr.length; l++) {
					if (sArr[l][k] == null) {
						continue;
					} else {
						o += sArr[l][k];
					}
				}
			}
			System.out.println(o);
	}
	}