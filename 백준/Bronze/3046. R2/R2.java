import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(str.nextToken());
		int s = Integer.parseInt(str.nextToken());
		
		System.out.println(2 * s - r);
		
	}
}