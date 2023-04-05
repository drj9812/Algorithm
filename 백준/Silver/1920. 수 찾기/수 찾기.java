import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> list = new HashMap<>();
		
		StringTokenizer str = new StringTokenizer(br.readLine());
				
		for (int i = 0; i < n; i++) {
			list.put(Integer.parseInt(str.nextToken()), 0);
		}
		
		int k = Integer.parseInt(br.readLine());
		str = new StringTokenizer(br.readLine());
		
		for (int j = 0; j < k; j++) {
			Integer x = Integer.parseInt(str.nextToken());
			
			if (list.containsKey(x) == true) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}
