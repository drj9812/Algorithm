import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(tkn.nextToken());
		int b = Integer.parseInt(tkn.nextToken());
		int c = Integer.parseInt(tkn.nextToken());
		int m = Integer.parseInt(tkn.nextToken());
		
		int fatigue = 0;
		int work = 0;
		
		for (int i = 1; i <= 24; i++) {
			if (fatigue + a <= m) {
				fatigue += a;
				work += b;
				
			} else {
				fatigue -= c;
				if (fatigue < 0) {
					fatigue = 0;
				}
			}
		}
		System.out.println(work);
	}
}