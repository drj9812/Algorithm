import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String[] sArr = str.split("");
			int cnt = 0;
			
			for (int i = 0; i < sArr.length/2; i++) {
				if (sArr[i].equals((sArr[sArr.length - (i + 1)]))) {
					cnt++;
				}
			}
			
			if (cnt == sArr.length/2) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}