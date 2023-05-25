import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int a = Integer.parseInt(br.readLine());
		long factorial = 1;
		
		for (int i = a; i > 0; i--) {
			factorial *= i;
		}
		
		System.out.println(factorial);
	}
}