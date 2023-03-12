import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer str = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(str.nextToken());
			int m = Integer.parseInt(str.nextToken());
			int[] iArr = new int[n];

			
			for (int i = 0; i < iArr.length; i++) {
				iArr[i] = i+1;
			}
			
			for (int j = 0; j < m; j++) {
				StringTokenizer str1 = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(str1.nextToken());
				int b = Integer.parseInt(str1.nextToken());
				int tmp = iArr[a-1];
				iArr[a-1] = iArr[b-1];
				iArr[b-1] = tmp;
			}
			
			for (int k = 0; k < iArr.length; k++) {
				System.out.print(iArr[k]);
				if (k == iArr.length-1) {
					break;
				} else {
					System.out.print(" ");
				}
			}
		}
	}