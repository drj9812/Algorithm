import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String[] sArr = str.split("/");
			
			if (Integer.parseInt(sArr[1]) == 0) {
				System.out.println("hasu");
			} else if (Integer.parseInt(sArr[0]) + Integer.parseInt(sArr[2]) < Integer.parseInt(sArr[1])){
				System.out.println("hasu");
			} else {
				System.out.println("gosu");
			}
		}
	}