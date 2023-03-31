import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedHashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		LinkedHashMap<Integer, Integer> cardList = new LinkedHashMap<>();
		
		for (int i = 0; i < n; i++) {
			int a  = Integer.parseInt(str.nextToken());
			Integer cnt = cardList.get(a);
			if (cardList.get(a) == null) {
				cardList.put(a, 1);
			} else {
				cardList.put(a, cnt + 1);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		StringTokenizer str1 = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < m; j++) {
			int b = Integer.parseInt(str1.nextToken());
			if (cardList.get(b) == null) {
				sb.append(0).append(" ");
			} else {
				sb.append(cardList.get(b)).append(" ");
			}
		}
		System.out.println(sb);
	}
}