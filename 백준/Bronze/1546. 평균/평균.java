import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());
			double[] iArr = new double[a];
			StringTokenizer str = new StringTokenizer(br.readLine());
			double max = 0;
			double sum = 0;
			double everage = 0;
			
			for (int i = 0; i < iArr.length; i++) {
				iArr[i] = Integer.parseInt(str.nextToken());
			}
			for (int j = 0; j < iArr.length; j++) {
				if (iArr[j] > max) {
					max = iArr[j];
				}
			}
			for (int k = 0 ; k < iArr.length; k++) {
				iArr[k] = (iArr[k]/max)*100;
			}
			for (int L = 0; L < iArr.length; L++) {
				sum += iArr[L];
			}
			everage = sum/iArr.length;
			System.out.println(everage);
		}
	}