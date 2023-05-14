import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(tkn.nextToken());
		int[] units = new int[n];
		int k = Integer.parseInt(tkn.nextToken());

		int cnt = 0;

		for (int i = 0; i < n; i++) {
			units[i] = Integer.parseInt(br.readLine());
		}
		
		int maxIndex = units.length - 1;
		
		while (maxIndex >= 0) {
			if (k % units[maxIndex] == 0) {
				cnt += k / units[maxIndex];
				break;
			} else {
				cnt += k / units[maxIndex];
				k %= units[maxIndex];
				maxIndex--;
			}
		}
		System.out.println(cnt);
	}
}