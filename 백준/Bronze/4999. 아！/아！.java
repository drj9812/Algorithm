import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String longestAaahByJaeHwan = br.readLine();
		String doctorRequiredAah = br.readLine();
		
		if (longestAaahByJaeHwan.length() >= doctorRequiredAah.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
	}
}
