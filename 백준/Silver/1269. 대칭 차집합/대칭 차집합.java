import java.io.*;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(str.nextToken());
		HashSet<Integer> aList = new HashSet<>();

		int b = Integer.parseInt(str.nextToken());
		HashSet<Integer> bList = new HashSet<>();

		StringTokenizer str1 = new StringTokenizer(br.readLine());

		for (int i = 0; i < a; i++) {
			aList.add(Integer.parseInt(str1.nextToken()));
		}

		StringTokenizer str2 = new StringTokenizer(br.readLine());

		for (int j = 0; j < b; j++) {
			int n = Integer.parseInt(str2.nextToken());
			bList.add(n);
			if (aList.contains(n) == true) {
				a--;
			}
		}

		for (Integer x : aList) {
			if (bList.contains(x) == true) {
				b--;
			}
		}

		System.out.println(a + b);
	}
}