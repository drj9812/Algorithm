import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		String[] words = new String[n];

		for (int i = 0; i < words.length; i++) {
			words[i] = br.readLine();
		}

		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return Integer.compare(s1.length(), s2.length());
				}
			}
		});
		
		sb.append(words[0]).append("\n");
		
		for (int j = 1; j < words.length; j++) {
			if (!words[j].equals(words[j - 1])) {
				sb.append(words[j]).append("\n");
			}
		}
		System.out.println(sb);
	}
}