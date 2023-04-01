import java.io.*;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			HashSet<Integer> list = new HashSet<Integer>();
			
			for (int j = 0; j < n; j++) {
				list.add(Integer.parseInt(str.nextToken()));
			}
			
			int m = Integer.parseInt(br.readLine());
			str = new StringTokenizer(br.readLine());
			
			for (int k = 0; k < m; k++) {
				if (list.contains(Integer.parseInt(str.nextToken())) == true) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}