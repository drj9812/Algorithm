import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int a = Integer.parseInt(br.readLine());
			int[] iArr = new int[a];
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < iArr.length; i++) {
				iArr[i] = Integer.parseInt(str.nextToken());
			}
			
			int Max = iArr[0];
			int Min = iArr[0];
			
			for (int i = 0; i < iArr.length; i++) {
				if (iArr[i] > Max) {
					Max = iArr[i];
				} else if (iArr[i] < Min) {
					Min = iArr[i];
				}
				
			}
			System.out.println(Min+" "+Max);
		}
	}