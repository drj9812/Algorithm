import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(tkn.nextToken());
		long b = Long.parseLong(tkn.nextToken());
		long c = Long.parseLong(tkn.nextToken());
		
		long result = a + b + c;
		
		System.out.println(result);
	}
}