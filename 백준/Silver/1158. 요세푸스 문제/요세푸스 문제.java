import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(str.nextToken());
		int k = Integer.parseInt(str.nextToken());
		ArrayList<Integer> josephus = new ArrayList<>();
		ArrayList<Integer> outPut = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			josephus.add(i);
		}

		int j = 0;

		while (true) {
			j += k - 1;

			if (j > josephus.size() - 1) {
//				j = j - josephus.size();
				j = j % josephus.size();
				if (j > josephus.size() - 1) {
//					j = j - josephus.size();
					j = j % josephus.size();
//					System.out.println(josephus.get(j));
					outPut.add(josephus.get(j));
					josephus.remove(j);
				}
//				System.out.println(josephus.get(j));
				outPut.add(josephus.get(j));
				josephus.remove(j);
			} else {
//				System.out.println(josephus.get(j));
				outPut.add(josephus.get(j));
				josephus.remove(j);
			}
			if (josephus.size() == 0) {
				break;
			}
		}

		for (int l = 0; l < n; l++) {
			if (n == 1 && k ==1) {
				System.out.println("<1>");
			} else if (l == 0) {
				System.out.print("<" + outPut.get(l) + ", ");
			} else if (l != n - 1) {
				System.out.print(outPut.get(l) + ", ");
			} else {
				System.out.print(outPut.get(l) + ">");
			}
		}

	}
}