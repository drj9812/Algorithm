import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		BigInteger a = new BigInteger(tkn.nextToken());
		BigInteger b = new BigInteger(tkn.nextToken());
		
		System.out.println(a.multiply(b));
		
	}
}
