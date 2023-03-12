import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());
			int cnt = 0;
			int sum = 0;
			
			for (int i = 0; i < a; i++) {
				String str = new String(br.readLine());
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j)=='O') {
						cnt++;
						sum += cnt;
					} else {
						cnt = 0;
					}
				}
				System.out.println(sum);
				sum = 0;
				cnt = 0;
			}
		}
	}