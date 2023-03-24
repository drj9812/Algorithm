import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(str.nextToken());
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		
		int result = (k * n - m);
		
		if (result > 0) {
			System.out.println(result);
		} else {
			System.out.println(0);
		}
	}
}