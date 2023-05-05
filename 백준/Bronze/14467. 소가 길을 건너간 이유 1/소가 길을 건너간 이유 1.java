import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedHashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		LinkedHashMap<Integer, Integer> observationLog = new LinkedHashMap<Integer, Integer>();
		
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		observationLog.put(Integer.parseInt(tkn.nextToken()), Integer.parseInt(tkn.nextToken()));
		
		int cnt = 0;

		for (int i = 1; i < n; i++) {
			tkn = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(tkn.nextToken());
			int loc = Integer.parseInt(tkn.nextToken());
			
			if (observationLog.containsKey(num)) {
				if (observationLog.get(num) != loc) {
					observationLog.put(num, loc);
					cnt++;
				}
			}
			observationLog.put(num, loc);
		}
		System.out.println(cnt);
	}
}
