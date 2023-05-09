import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		int numPeople = Integer.parseInt(tkn.nextToken());
		int area = Integer.parseInt(tkn.nextToken());
		
		tkn = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < 5; i++) {
			int article = Integer.parseInt(tkn.nextToken());
			sb.append(article - (numPeople * area) + " ");
		}
		
		System.out.println(sb.toString());
		
	}
}
