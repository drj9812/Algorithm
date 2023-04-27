import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		int[] constant = new int[6];
		
		for (int i = 0; i < constant.length; i++) {
			constant[i] = Integer.parseInt(tkn.nextToken());
		}
		
		for (int x = -999; x < 1000; x++) {
			for (int y = -999; y < 1000; y++) {
				if (constant[0] * x + constant[1] * y == constant[2] &&
						constant[3] * x + constant[4] * y == constant[5]) {
					System.out.print(x + " ");
					System.out.print(y);
					break;
				}
			}
		}
		
	}
}
