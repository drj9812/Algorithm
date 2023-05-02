import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] bowls = new int[3];
		
		for (int i = 0; i < 3; i++) {
			bowls[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(bowls);
		
		System.out.println(bowls[1]);
	}
}
