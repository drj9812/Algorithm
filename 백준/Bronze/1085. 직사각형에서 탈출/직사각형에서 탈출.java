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

		int minDistance = x;

		if (x > y) {
			minDistance = y;
			if (minDistance > (w - x)) {
				minDistance = w - x;
				if (minDistance > (h - y)) {
					minDistance = h - y;
				}
			} else {
				if (minDistance > (h - y)) {
					minDistance = h - y;
				}
			}

		} else {
			if (minDistance > (w - x)) {
				minDistance = w - x;
				if (minDistance > (h - y)) {
					minDistance = h - y;
				}
			} else {
				if (minDistance > (h - y)) {
					minDistance = h - y;
				}
			}
		}

		System.out.println(minDistance);

	}
}