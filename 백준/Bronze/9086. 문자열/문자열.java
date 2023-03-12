import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < a; i++) {
				String str = br.readLine();
					System.out.print(str.charAt(0));
					System.out.print(str.charAt(str.length()-1));
					System.out.println();
			}
		}
	}