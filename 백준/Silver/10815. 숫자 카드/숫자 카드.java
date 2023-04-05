import java.io.*;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		HashSet<Integer> cardList = new HashSet<Integer>();

		StringTokenizer str = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			cardList.add(Integer.parseInt(str.nextToken()));
		}

		int m = Integer.parseInt(br.readLine());

		str = new StringTokenizer(br.readLine());

		for (int j = 0; j < m; j++) {
			if (cardList.contains(Integer.parseInt(str.nextToken()))) {
				sb.append(1 + " ");
			} else {
				sb.append(0 + " ");
			}
		}
		System.out.println(sb);
	}
}