import java.io.*;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Boolean> chatLogs = new HashMap<String, Boolean>();
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			
			if (input.equals("ENTER")) {
				chatLogs.clear();
				continue;
				
			} else {
				if (!chatLogs.containsKey(input)) {
					chatLogs.put(input, true);
					cnt++;
				} else {
					chatLogs.put(input, false);
				}
			}
		}
		System.out.println(cnt);
	}
}