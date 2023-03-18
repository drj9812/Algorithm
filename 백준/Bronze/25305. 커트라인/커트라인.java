import java.io.*;
import java.util.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer str = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(str.nextToken());
			int m = Integer.parseInt(str.nextToken());
			int[] iArr = new int[n];
			int tmp = 0;
			StringTokenizer str1 = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < iArr.length; i++) {
				iArr[i] = Integer.parseInt(str1.nextToken());
			}
			
			for (int j = 0; j < iArr.length - 1; j++) {
				for (int k = j + 1; k < iArr.length; k++) {
					if (iArr[j] < iArr[k]) {
						tmp = iArr[k];
						iArr[k] = iArr[j];
						iArr[j] = tmp;
					}
				}
			}
			
			System.out.println(iArr[m - 1]);
		}
	}