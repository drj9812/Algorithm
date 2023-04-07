import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(tkn.nextToken());
		int y = Integer.parseInt(tkn.nextToken());
		int w = Integer.parseInt(tkn.nextToken());
		int h = Integer.parseInt(tkn.nextToken());
		
		int minX = Math.min(x, w - x);
		int minY = Math.min(y, h - y);
		
		System.out.println(Math.min(minX, minY));
	}
}
