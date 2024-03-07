import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn;
		
		int n = Integer.parseInt(br.readLine());
		tkn = new StringTokenizer(br.readLine());
		
		int max = Integer.parseInt(tkn.nextToken());
		int min = max;
		
		for (int i = 0; i < n - 1; i++) {
			int num = Integer.parseInt(tkn.nextToken());
			
			if (max < num) {
				max = num;
			} else if (min > num) {
				min = num;
			}
		}
		
		System.out.println(min + " " + max);
	}
}