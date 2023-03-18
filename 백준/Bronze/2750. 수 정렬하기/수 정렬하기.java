import java.util.*;
import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			int[] iArr = new int[n];
			for (int i = 0; i < n; i++) {
				iArr[i] = Integer.parseInt(br.readLine());
			}
			
			Arrays.sort(iArr);
			
			for (int j = 0; j < n; j++) {
				System.out.println(iArr[j]);
			}
		}
	}