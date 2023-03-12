import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int[] iArr = new int[] { Integer.parseInt(str.nextToken()), Integer.parseInt(str.nextToken()) };
			if (iArr[0] != 0 && iArr[1] != 0) {
				if (iArr[1] % iArr[0] == 0) {
					System.out.println("factor");
				} else if (iArr[0] % iArr[1] == 0) {
					System.out.println("multiple");
				} else {
					System.out.println("neither");
				}
			} else {
				break;
			}

		}
	}
}
