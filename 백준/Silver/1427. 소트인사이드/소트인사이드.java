import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String[] sArr = str.split("");
			String tmp = "";
			
			for (int i = 0; i < sArr.length - 1; i++) {
				for (int j = i + 1; j < sArr.length; j++) {
					if (Integer.parseInt(sArr[i]) < Integer.parseInt(sArr[j])) {
						tmp = sArr[j];
						sArr[j] = sArr[i];
						sArr[i] = tmp;
					}
				}
			}
			
			for (int k = 0; k < sArr.length; k++) {
				System.out.print(sArr[k]);
			}
		}
	}