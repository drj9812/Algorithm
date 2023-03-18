import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int[] iArr = new int[5];
			int sum = 0;
			int tmp = 0;
			
			for (int i = 0; i < iArr.length; i++) {
				iArr[i] = Integer.parseInt(br.readLine());
				sum += iArr[i];
			}
			
			for (int j = 0 ; j < iArr.length - 1; j++) {
				for (int k = j + 1; k < iArr.length; k++) {
					if (iArr[j] > iArr[k]) {
						tmp = iArr[k];
						iArr[k] = iArr[j];
						iArr[j] = tmp;
					}
				}
			}
			
			System.out.println(sum / iArr.length);
			System.out.println(iArr[2]);
		}
	}