import java.io.*;
import java.util.StringTokenizer;

	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int a = Integer.parseInt(br.readLine());
			StringTokenizer str = new StringTokenizer(br.readLine());
			int[] iArr = new int[a];
			int cnt = 0;
			
			for (int i = 0; i < iArr.length; i++) {
				iArr[i] = Integer.parseInt(str.nextToken());
				if (iArr[i] == 1) {
					cnt++;
				} else {
					for (int j = 2; j < iArr[i]; j++) {
						if (iArr[i] % j == 0) {
							cnt++;
							break;
						}
					}
				}
			}
			System.out.println(a - cnt);
		}
	}