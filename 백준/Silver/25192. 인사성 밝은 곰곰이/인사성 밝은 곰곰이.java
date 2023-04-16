import java.io.*;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		HashSet<String> chatLogs = new HashSet<String>();
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			
			if (input.equals("ENTER")) {
				chatLogs.clear();
				continue;
			}
			
			if (!chatLogs.contains(input)) {
				chatLogs.add(input);
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
