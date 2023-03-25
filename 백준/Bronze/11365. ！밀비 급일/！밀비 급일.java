import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {

			String input = br.readLine();
			if (input.equals("END")) {
				break;
			}
			StringBuilder sb = new StringBuilder(input);
			String reverseInput = sb.reverse().toString();
			System.out.println(reverseInput);


		}
	}
}
