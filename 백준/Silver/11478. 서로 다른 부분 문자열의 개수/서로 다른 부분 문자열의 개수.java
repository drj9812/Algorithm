import java.io.*;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		int result = twoPointer(input);

		System.out.println(result);

	}

	private static int twoPointer(String input) {
		HashSet<String> stringSet = new HashSet<String>();

		for (int i = 1; i <= input.length(); i++) {
			int startIndex = 0;
			int endIndex = i;

			while (endIndex <= input.length()) {
				String string = input.substring(startIndex, endIndex);
				stringSet.add(string);
				startIndex++;
				endIndex++;
			}
		}

		return stringSet.size();
	}
}