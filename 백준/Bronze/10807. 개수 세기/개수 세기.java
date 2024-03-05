import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn;
		int cnt = 0;
		
		int n = Integer.parseInt(br.readLine());
		int[] nArray = new int[n];
		
		tkn = new StringTokenizer(br.readLine());
		int target = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < nArray.length; i++) {
			nArray[i] = Integer.parseInt(tkn.nextToken());
			
			if (nArray[i] == target) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}