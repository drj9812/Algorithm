import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer tkn = new StringTokenizer(br.readLine());
			int[] triangle = new int[3];
			
			for (int i = 0; i < triangle.length; i++) {
				triangle[i] = Integer.parseInt(tkn.nextToken());
			}
			
			if (triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0) {
				break;
			}
			
			Arrays.sort(triangle);
			
			int aSquare = triangle[0] * triangle[0];
			int bSquare = triangle[1] * triangle[1];
			int cSquare = triangle[2] * triangle[2];
			
			if (aSquare + bSquare == cSquare) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}