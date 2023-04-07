import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(tkn.nextToken());
		int[] iArr = new int[n];
		int m = Integer.parseInt(tkn.nextToken());

		tkn = new StringTokenizer(br.readLine());

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = Integer.parseInt(tkn.nextToken());
		}

		int result = twoPointer(iArr, m);

		System.out.println(result);

	}

	public static int twoPointer(int[] iArr, int target) {

		int startIndex = 0;
		int endIndex = 0;
		int intervalSum = 0;
		int cnt = 0;

		while (true) {

			if (intervalSum >= target) {
				intervalSum -= iArr[startIndex++];
			} else if (endIndex == iArr.length) {
				break;
			} else if (intervalSum < target) {
				intervalSum += iArr[endIndex++];
			}

			if (intervalSum == target) {
				cnt++;
			}

		}

		return cnt;
	}

}