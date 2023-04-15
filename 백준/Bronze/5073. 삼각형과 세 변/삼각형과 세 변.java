import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			int[] leg = new int[3];

			StringTokenizer tkn = new StringTokenizer(br.readLine());

			for (int i = 0; i < leg.length; i++) {
				leg[i] = Integer.parseInt(tkn.nextToken());
			}
			
			if (leg[0] + leg[1] + leg[2] == 0) {
				break;
			}
			
			Arrays.sort(leg);

			if (leg[2] < leg[0] + leg[1]) {
				if (leg[0] == leg[1] && leg[0] == leg[2]) {
					System.out.println("Equilateral");
				} else if ((leg[0] == leg[1] && leg[0] != leg[2]) || (leg[0] != leg[1] && leg[1] == leg[2])) {
					System.out.println("Isosceles");
				} else {
					System.out.println("Scalene");
				}
			} else {
				System.out.println("Invalid");
			}
		}
	}
}