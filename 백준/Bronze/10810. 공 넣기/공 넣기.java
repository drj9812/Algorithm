import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer str = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(str.nextToken());
			int m = Integer.parseInt(str.nextToken());
			int[] iArr = new int[n];
			
			for (int i = 0; i < m; i++) {
				StringTokenizer str1 = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(str1.nextToken());
				int b = Integer.parseInt(str1.nextToken());
				int c = Integer.parseInt(str1.nextToken());
				for(int j = a-1; j <= b-1; j++) {
					iArr[j] = c;
				}
			}
			for (int k = 0; k < n; k++) {
				System.out.print(iArr[k]);
				if (k == n-1) {
					break;
				} else {
					System.out.print(" ");
				}
			}
		}
	}