import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] sArr = br.readLine().split("");
			int a = Integer.parseInt(sArr[2] + sArr[1] + sArr[0]);
			int b = Integer.parseInt(sArr[6] + sArr[5] + sArr[4]);
			
			if (a > b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		}
	}