import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] iArr = new int[n][2];
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		iArr[0][0] = Integer.parseInt(tkn.nextToken());
		iArr[0][1] = Integer.parseInt(tkn.nextToken());

		int maxX = iArr[0][0];
		int minX = iArr[0][0];
		int maxY = iArr[0][1];
		int minY = iArr[0][1];

		for (int i = 1; i < n; i++) {
			tkn = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				iArr[i][j] = Integer.parseInt(tkn.nextToken());
				if (j == 0) {
					if (iArr[i][j] > maxX) {
						maxX = iArr[i][j];
					}
					if (iArr[i][j] < minX) {
						minX = iArr[i][j];
					}
				} else if (j == 1) {
					if (iArr[i][j] > maxY) {
						maxY = iArr[i][j];
					}
					if (iArr[i][j] < minY) {
						minY = iArr[i][j];
					}
				}
			}
		}
		
		
		if (n > 1) {
			System.out.println((maxX - minX) * (maxY - minY));
		} else {
			System.out.println(0);
		}

	}
}