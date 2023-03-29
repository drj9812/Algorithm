import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		TreeMap<String, String> list = new TreeMap<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			list.put(str.nextToken(), str.nextToken());
		}
		
		Set<String> key = list.descendingKeySet();
		
		for (String x : key) {
			if (list.get(x).equals("enter")) {
				System.out.println(x);
			}
		}
	}
}

