import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] iArr = new int[4];
		

		for (int i = 0; i < 3; i++) {
			int cnt = 0;
			StringTokenizer str = new StringTokenizer(br.readLine());
			for (int j = 0; j < iArr.length; j++) {
				iArr[j] = Integer.parseInt(str.nextToken());
				if (iArr[j] == 0) {
					cnt++;
				}
			}
			if (cnt == 4) {
				System.out.println("D");
			} else if (cnt == 3) {
				System.out.println("C");
			} else if (cnt == 2) {
				System.out.println("B");
			} else if (cnt == 1) {
				System.out.println("A");
			} else {
				System.out.println("E");
			}
		}
	}
}
