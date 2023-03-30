import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] list = new String[n * 2 - 1];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = br.readLine();
		}
		
		HashMap<String, Boolean> completeList = new HashMap<>();
		
		for (String x : list) {
			if (completeList.get(x) == null) {
				completeList.put(x, false);
			} else if (completeList.get(x) == false) {
				completeList.put(x, true);
			} else if (completeList.get(x) == true) {
				completeList.put(x, false);
			}
		}
		
		Set<String> key = completeList.keySet();
		
		for (String y : key) {
			if (completeList.get(y) != true) {
				System.out.println(y);
			}
		}
	}
}