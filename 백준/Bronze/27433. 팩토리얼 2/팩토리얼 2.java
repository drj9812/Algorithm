import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(n));
	}
	
	private static long factorial(long n) {
		if (n == 0) {
			return 1;
			
		} else {
			n *= factorial(n - 1);
			
			return n;
		}
	}
}