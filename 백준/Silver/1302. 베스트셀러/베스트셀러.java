import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] input = new String[n];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = br.readLine();
		}
		
		TreeMap<String, Integer> list = new TreeMap<>();

		for (String x : input) {
			Integer cnt = list.get(x);
			if (list.get(x) == null) {
				list.put(x, 1);
			} else {
				list.put(x, cnt + 1);
			}
		}
		
		Set<String> key = list.keySet();
		int max = 0;
		String bestSeller = "";
		
		for (String y : key) {
			if (list.get(y) > max) {
				max = list.get(y);
				bestSeller = y;
			}
		}
		System.out.println(bestSeller);
	}
}
