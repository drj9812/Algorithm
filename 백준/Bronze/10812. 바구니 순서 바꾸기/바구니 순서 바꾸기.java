import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer str = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(str.nextToken());
			int[] iArr = new int[a];
			for (int i = 0; i < iArr.length; i++) {
				iArr[i] = i + 1;
			}
			int b = Integer.parseInt(str.nextToken());
			
			for (int j = 0 ; j < b; j++) {
				StringTokenizer str1 = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(str1.nextToken()) - 1;
				int d = Integer.parseInt(str1.nextToken()) - 1;
				int e = Integer.parseInt(str1.nextToken()) - 1;
				int[] iArr1 = Arrays.copyOfRange(iArr, c, d + 1);
//				System.out.println(Arrays.toString(iArr1));
				int f = 0;
				for (int k = e, l = c; k < iArr1.length + e; k++, l++) {
					if (k <= d) {
						iArr[l] = iArr1[k-c];	
					} else {
						f = l;
						break;
					}
				}
				for (int m = 0, n = f ; m < e - c; m++, n++) {
//					System.out.println(iArr[n]);
//					System.out.println(iArr1[m]);
					iArr[n] = iArr1[m];
					
				}
			}
			for (int o = 0; o < iArr.length; o++) {
				System.out.print(iArr[o]);
				System.out.print(" ");
			}
		}
	}