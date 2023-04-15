import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		int[] leg = new int[3];
		
		for (int i = 0; i < leg.length; i++) {
			leg[i] = Integer.parseInt(tkn.nextToken());
		}
		
		Arrays.sort(leg);
		
		if (leg[2] >= leg[0] + leg[1]) {
			leg[2] = leg[0] + leg[1] - 1;
			System.out.println(leg[0] + leg[1] + leg[2]);
		} else {
			System.out.println(leg[0] + leg[1] + leg[2]);
			
		}
	}
}
