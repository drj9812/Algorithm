import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(getFibonacciNumber(n));
		
	}
	
	private static int getFibonacciNumber (int n) {
		if (n <= 0) {
			return 0;
			
		} else if (n == 1) {
			return 1;
			
		} else {
			n = getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
			
			return n;
		}
	}
}