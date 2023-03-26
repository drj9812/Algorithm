import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int y = 0;
		int m = 0;
		
		int n = Integer.parseInt(br.readLine());
		int[] iArr = new int[n];
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			iArr[i] = Integer.parseInt(str.nextToken());
			y += ((iArr[i] / 30) + 1) * 10;
			m += ((iArr[i] / 60) + 1) * 15;
		}
		
		if (y > m) {
			System.out.println("M " + m);
		} else if (y < m) {
			System.out.println("Y " + y);
		} else {
			System.out.println("Y M " + y);
		}
		
	}
}