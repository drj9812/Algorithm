import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] sArr = br.readLine().split(" ");
			int[][] iArr = new int[Integer.parseInt(sArr[0])][Integer.parseInt(sArr[1])];
			int[][] iArr1 = new int[Integer.parseInt(sArr[0])][Integer.parseInt(sArr[1])];
			
			for (int i = 0; i < Integer.parseInt(sArr[0]); i++) {
				StringTokenizer str = new StringTokenizer(br.readLine());
				for (int j = 0; j < Integer.parseInt(sArr[1]); j++) {
					iArr[i][j] = Integer.parseInt(str.nextToken());
				}
			}
			
			for (int k = 0; k < Integer.parseInt(sArr[0]); k++) {
				StringTokenizer str = new StringTokenizer(br.readLine());
				for (int l = 0; l < Integer.parseInt(sArr[1]); l++) {
					iArr1[k][l] = Integer.parseInt(str.nextToken());
				}
			}
			
			int[][] iArr2 = new int[Integer.parseInt(sArr[0])][Integer.parseInt(sArr[1])];
			
			for (int m = 0; m < Integer.parseInt(sArr[0]); m++) {
				for (int n = 0; n < Integer.parseInt(sArr[1]); n++) {
					iArr2[m][n] = iArr[m][n] + iArr1[m][n];
					System.out.print(iArr2[m][n]);
					System.out.print(" ");
				}
				System.out.println();
			}
			
		}
	}