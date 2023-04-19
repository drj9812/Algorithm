import java.io.*;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		HashSet<String> set = new HashSet<String>();
		
		int n = Integer.parseInt(tkn.nextToken());
		int m = Integer.parseInt(tkn.nextToken());
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			String element = br.readLine();
			set.add(element);
		}
		
		for (int j = 0; j < m; j++) {
			String input = br.readLine();
			if (set.contains(input)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}