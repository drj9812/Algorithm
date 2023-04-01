import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(str.nextToken());
		HashMap<Integer, String> list = new HashMap<Integer, String>();
		HashMap<String, Integer> reverseList = new HashMap<String, Integer>();
		
		int m = Integer.parseInt(str.nextToken());
		
		for (int i = 1; i <= n; i++) {
			String input = br.readLine();
			list.put(i, input);
			reverseList.put(input, i);
		}
		
		for (int j = 0; j < m; j++) {
			String result = "";
			try {
				result = br.readLine();
				System.out.println(list.get(Integer.parseInt(result)));
			} catch (Exception e) {
				System.out.println(reverseList.get(result));
			}
			
		}
	}
}