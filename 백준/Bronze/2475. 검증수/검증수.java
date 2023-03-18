import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer str = new StringTokenizer(br.readLine());
			int[] iArr = new int[5];
			
			for (int i = 0; i < 5; i++) {
				iArr[i] = Integer.parseInt(str.nextToken());
			}
			int output = ((iArr[0] * iArr[0]) + (iArr[1] * iArr[1]) + (iArr[2] * iArr[2]) +
					(iArr[3] * iArr[3]) + (iArr[4] * iArr[4])) % 10;
			
			System.out.println(output);

		}
	}