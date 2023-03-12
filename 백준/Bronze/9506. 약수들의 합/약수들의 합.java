import java.io.*;
import java.util.*;
	public class  Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while (true) {
				int n = Integer.parseInt(br.readLine());
				
				if (n == -1) {
					break;
				}
				
				int[] iArr = new int[n];
				int sum = 0;
				for (int i = 1; i <= iArr.length; i++) {
					if (n % i == 0) {
						iArr[i - 1]  = i;
					}
				}
				
				for(int x : iArr) {
					sum += x;
				}
				
				Arrays.sort(iArr);
				
				
				if (sum - n == n) {
					System.out.print(n + " = ");
					for (int j = 0; j < iArr.length - 1; j++) {
						if (iArr[j] != 0) {
							if (j != iArr.length - 2) {
								System.out.print(iArr[j] + " + ");
							} else {
								System.out.println(iArr[j]);
							}
						}
					}
				} else {
					System.out.println(n + " is NOT perfect.");
				}
			}
					
		}
	}