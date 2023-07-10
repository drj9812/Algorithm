import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();

		List<String> result = getFirstWord(word);
		Collections.sort(result);
		System.out.println(result.get(0));
	}

	public static List<String> getFirstWord(String word) {
		int length = word.length();
		List<String> arr = new ArrayList<>();
		
		for (int i = 1; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				String part1 = word.substring(0, i);
				String part2 = word.substring(i, j);
				String part3 = word.substring(j);

				StringBuilder reversedPart1 = new StringBuilder(part1).reverse();
				StringBuilder reversedPart2 = new StringBuilder(part2).reverse();
				StringBuilder reversedPart3 = new StringBuilder(part3).reverse();

				arr.add(reversedPart1.toString() + reversedPart2.toString() + reversedPart3.toString());
			}
		}
		return arr;
	}
}