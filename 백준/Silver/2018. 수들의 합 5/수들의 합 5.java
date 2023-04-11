import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] iArr = new int[n];

		for (int i = 1; i <= iArr.length; i++) {
			iArr[i - 1] = i;
		}

		int result = twoPointer(iArr, n);

		System.out.println(result);
	}

	private static int twoPointer(int[] iArr, int target) {
		int startIndex = 0;
		int endIndex = 0;
		int intervalSum = 0;
		int cnt = 0;

		while (startIndex <= endIndex) {
			if (intervalSum >= target) {
				intervalSum -= iArr[startIndex++];
			} else if (endIndex == target) {
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