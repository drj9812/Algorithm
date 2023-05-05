import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		BigInteger n = new BigInteger(tkn.nextToken());
		BigInteger m = new BigInteger(tkn.nextToken());
		
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
	}
}
