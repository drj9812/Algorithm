import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int[] iArr = new int[a];
			int b = Integer.parseInt(str.nextToken());
			
			for (int i = 0; i < iArr.length; i++) {
				iArr[i] = i+1;
			}
		
			for (int j = 0 ; j < b; j++) {
				StringTokenizer str1 = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(str1.nextToken());
				int d = Integer.parseInt(str1.nextToken());
				int[] iArr1 = Arrays.copyOfRange(iArr, c-1, d);
				for (int k = d - 1, l = 0; k >= c - 1; k--, l++) {
					if (c == d) {
						break;
					} else {
						iArr[k] = iArr1[l];
					}
				}
			}
			for (int m = 0; m < iArr.length; m++) {
				System.out.print(iArr[m]);
				if ( m == iArr.length-1) {
					break;
				} else {
					System.out.print(" ");
				}
			}
		}
	}