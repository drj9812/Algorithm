import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[][] iArr = new int[100][100];
			int a = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < a; i++) {
				StringTokenizer str = new StringTokenizer(br.readLine());
				int[] iArr1 = new int[2];
				iArr1[0] = Integer.parseInt(str.nextToken());
				iArr1[1] = Integer.parseInt(str.nextToken());
				
				for (int j = iArr1[1] - 1; j < iArr1[1] + 9; j++) {
					for (int k = iArr1[0] - 1; k < iArr1[0] + 9; k++) {
						iArr[j][k] = 1;
					}
				}
			}
			int sum = 0;
			
			for (int l = 0; l < 100; l++) {
				for (int m = 0; m < 100; m++) {
					if (iArr[l][m] == 1) {
						sum++;
					}
				}
			}
			System.out.println(sum);
		}
	}