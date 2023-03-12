import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer str = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			int c = Integer.parseInt(str.nextToken());

				if (b >= c) {
					System.out.println(-1);
				}	else {
						int bep = a/(c-b);
						bep++;
						System.out.println(bep);
				}
			}
		}