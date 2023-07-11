import java.io.*;

public class Main {
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;

		while ((input = br.readLine()) != null) {
			int n = Integer.parseInt(input);
			sb = new StringBuilder();
			int length = (int) Math.pow(3, n);

			for (int i = 0; i < length; i++) {
				sb.append("-");
			}
			getCantorSet(0, length);
			System.out.println(sb.toString());
		}
	}

	public static void getCantorSet(int startIndex, int length) {
		if (length == 1) {
			return;
		}

		int newLength = length / 3;

		for (int i = startIndex + newLength; i < startIndex + 2 * newLength; i++) {
			sb.setCharAt(i, ' ');
		}

		getCantorSet(startIndex, newLength);
		getCantorSet(startIndex + 2 * newLength, newLength);
	}
}