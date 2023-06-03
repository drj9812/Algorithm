import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			Stack<String> isVPS = new Stack<String>();
			String parenthesis = new String(br.readLine());
			String[] pArr = parenthesis.split("");

			for (int j = 0; j < pArr.length; j++) {
				if (pArr[j].equals("(")) {
					isVPS.push(pArr[j]);

				} else {
					try {
						if (isVPS.peek().equals("(")) {
							isVPS.pop();
						}
					} catch (Exception e) {
						isVPS.push(pArr[j]);
						break;
					}
				}
			}
			if (isVPS.empty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}