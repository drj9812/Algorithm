import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < a; i++) {
				StringTokenizer str = new StringTokenizer(br.readLine());
				int n = Integer.parseInt(str.nextToken());
				int[] iArr = new int[n];

				int sum = 0;
				double everage = 0;
				int cnt = 0;
				
				for(int j = 0; j < iArr.length; j++) {
					iArr[j] = Integer.parseInt(str.nextToken());
					sum += iArr[j];
					
				}
				everage = (double)sum/n;
				for (int k = 0; k < iArr.length; k++) {
				if ( iArr[k] > everage ) {
					cnt++;
				}
				}
				System.out.printf("%.3f%%%n", (double)cnt/n*100);
				
			}

		}
	}