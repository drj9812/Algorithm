import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		TreeMap<Integer, Integer> startToEnd = new TreeMap<>();

		int cnt = 0;
		int max = 0;

		for (int i = 0; i < n; i++) {
			StringTokenizer tkn = new StringTokenizer(br.readLine());

			Integer start = Integer.parseInt(tkn.nextToken());
			Integer end = Integer.parseInt(tkn.nextToken());

			if (max < end) {
				max = end;
			}
			if (startToEnd.containsKey(start)) {
				if (startToEnd.get(start) == start) {
					cnt++;
				}
				
				if (startToEnd.get(start) < end) {
					startToEnd.put(start, startToEnd.get(start));
				} else if (startToEnd.get(start) > end) {
					startToEnd.put(start, end);
					if (start == end) {
						cnt++;
					}
				}
			} else {
				startToEnd.put(start, end);
			}
		}

		Set<Integer> keys = startToEnd.descendingKeySet();

		for (Integer x : keys) {
			if (startToEnd.get(x) <= max) {
				cnt++;
				max = x;
			}
		}
		System.out.println(cnt);
	}
}