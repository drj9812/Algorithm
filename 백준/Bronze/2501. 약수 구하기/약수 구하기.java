import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(str.nextToken());
		int b = Integer.parseInt(str.nextToken());

		int[] iArr = new int[a];

		for (int i = 1; i <= iArr.length; i++) {
			if (a % i == 0) {
				iArr[i - 1] = i;
			}
		}
        
        Arrays.sort(iArr);
		int cnt = 0;

		for (int m = 0; m < iArr.length; m++) {
			if (iArr[m] != 0) {
				cnt++;
			}
		}

		if (b > cnt) {
			System.out.println(0);
		} else {
			cnt = 0;
			for (int n = 0; n < iArr.length; n++) {
				if (iArr[n] != 0) {
					cnt++;
					if (cnt == b) {
						System.out.println(iArr[n]);
						break;
					}
				}
			}
		}

	}
}