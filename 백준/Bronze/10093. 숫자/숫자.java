import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		BigInteger a = new BigInteger(tkn.nextToken());
		BigInteger b = new BigInteger(tkn.nextToken());

		BigInteger largerNum = a.max(b);
		BigInteger smallerNum = a.min(b);

		BigInteger numBetween = largerNum.subtract(smallerNum).subtract(BigInteger.ONE);

		if (largerNum.equals(smallerNum)) {
			System.out.println(0);
		} else {
			System.out.println(numBetween);

			BigInteger i = smallerNum.add(BigInteger.ONE);
			while (i.compareTo(largerNum) < 0) {
				sb.append(i + " ");
				i = i.add(BigInteger.ONE);
			}
		}
		System.out.println(sb.toString());
	}
}