import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedHashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		
		LinkedHashMap<String, String> siteAndPassword = new LinkedHashMap<>();
		
		for (int i = 0; i < n; i++) {
			StringTokenizer str1 = new StringTokenizer(br.readLine());
			siteAndPassword.put(str1.nextToken(), str1.nextToken());
		}
		
		for (int j = 0; j < m; j++) {
			System.out.println(siteAndPassword.get(br.readLine()));
		}

	}
}