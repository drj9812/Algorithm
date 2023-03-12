import java.util.*;
import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer str = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(str.nextToken());
			int m = Integer.parseInt(str.nextToken());
			int a = Integer.parseInt(br.readLine());

			int sum = m + a;
			
			if (sum >= 60) {
				h += (sum) / 60;
				sum = (sum) % 60; 
				if (h >= 24) {
					h = h % 24;
				}
			}
			System.out.printf("%d %d", h, sum);
		}
	}