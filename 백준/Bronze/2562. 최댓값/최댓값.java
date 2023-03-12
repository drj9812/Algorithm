import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int[] iArr = new int[9];
//			StringTokenizer str = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < iArr.length; i++) {
				iArr[i] = Integer.parseInt(br.readLine());
			}
			
			int max = 0;
			int index = 0;
			
			for (int i = 0; i < iArr.length; i++) {
				if (iArr[i] > max) {
					max = iArr[i];
					index = i;
					
				}
			}
			System.out.println(max);
			System.out.println(index+1);
		}
	}