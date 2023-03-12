import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < a/4; i++) {
				System.out.print("long");
				System.out.print(" ");
			}
			System.out.print("int");
		}
	}