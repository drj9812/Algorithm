import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String[] sArr = str.split("");
			int a = Integer.parseInt(br.readLine());
			
			for (int i = 0; i <= sArr.length; i++) {
				if (i == a) {
					System.out.println(sArr[i-1]);
				}
			}
		}
	}