import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		TreeMap<String, Boolean> anonymousList = new TreeMap<>();
		
		int n = Integer.parseInt(tkn.nextToken());
		int m = Integer.parseInt(tkn.nextToken());
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			String unknwonPerson = br.readLine();
			anonymousList.put(unknwonPerson, false);
		}
		
		for (int j = 0; j < m; j++) {
			String unseenPerson = br.readLine();
			if (anonymousList.containsKey(unseenPerson)) {
				anonymousList.put(unseenPerson, true);
				cnt++;
			}
		}
		
		Set<String> key = anonymousList.keySet();
		
		for (String x : key) {
			if (anonymousList.get(x) == true) {
				sb.append(x + "\n");
			}
		}
		
		System.out.println(cnt);
		System.out.println(sb);
	}
}