import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[][] iArr = new int[9][9];
			
			for (int i = 0; i < 9; i++) {
				StringTokenizer str = new StringTokenizer(br.readLine());
				for (int j = 0; j < 9; j++) {
					iArr[i][j] = Integer.parseInt(str.nextToken());
				}
			}
			
			int max = -1;
			int row = 0;
			int column = 0;
			
			for (int k = 0; k < 9; k++) {
				for (int l = 0; l < 9; l++) {
					if (iArr[k][l] > max) {
						max = iArr[k][l];
						row = k+1;
						column = l+1;
					}
				}
			}
			System.out.println(max);
			System.out.print(row + " " + column);
		}
	}