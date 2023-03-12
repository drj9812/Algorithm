import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int k = Integer.parseInt(str.nextToken());
			int q = Integer.parseInt(str.nextToken());
			int r = Integer.parseInt(str.nextToken());
			int bs = Integer.parseInt(str.nextToken());
			int kn = Integer.parseInt(str.nextToken());
			int p = Integer.parseInt(str.nextToken());
			
			if (k != 1) {
				System.out.println(1 - k);
			} else {
				System.out.println(0);
			}
			
			if (q != 1) {
				System.out.println(1 - q);
			} else {
				System.out.println(0);
			}
			
			if (r != 2) {
				System.out.println(2-r);
			} else {
				System.out.println(0);
			}
			
			if (bs != 2) {
				System.out.println(2 - bs);
			} else {
				System.out.println(0);
			}
			
			if (kn != 2) {
				System.out.println(2 - kn);
			} else {
				System.out.println(0);
			}
			
			if (p != 8) {
				System.out.println(8 - p);
			} else {
				System.out.println(0);
			}
		}
	}