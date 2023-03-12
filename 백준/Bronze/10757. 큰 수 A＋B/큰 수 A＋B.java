import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer str = new StringTokenizer(br.readLine());
			BigInteger a = new BigInteger(str.nextToken());
			BigInteger b = new BigInteger(str.nextToken());
			a = a.add(b);
//			System.out.println(a.add(b));
			System.out.println(a.toString());
		}
	}