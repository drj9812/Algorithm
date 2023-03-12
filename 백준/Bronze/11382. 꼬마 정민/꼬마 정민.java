import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer str = new StringTokenizer(br.readLine());
			long a = Long.parseLong(str.nextToken());
			long b = Long.parseLong(str.nextToken());
			long c = Long.parseLong(str.nextToken());
	
			System.out.println(a+b+c);
		}
	}