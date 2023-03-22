import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sArr = str.split("");
		
		for (int i = 1; i <= sArr.length; i++) {
			if (i % 10 == 0) {
				System.out.print(sArr[i-1]);
				System.out.println();
			} else {
				System.out.print(sArr[i-1]);
			}
		}
	}
}
