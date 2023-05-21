import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int cnt = n;
			
			TreeMap<Integer, Integer> rankList = new TreeMap<>();
			
			for (int j = 0; j < n; j++) {
				StringTokenizer tkn = new StringTokenizer(br.readLine());
		
				rankList.put(Integer.parseInt(tkn.nextToken()), Integer.parseInt(tkn.nextToken()));
			}
			
			int max = rankList.get(1);
			
			Set<Integer> keys = rankList.keySet();

			for (Integer x : keys) {
				if (x == 1) {
					continue;
				} else {
					if (rankList.get(x) > max) {
						cnt--;
					} else {
						max = rankList.get(x);
					}
				}
			}
			System.out.println(cnt);
		}
	}
}