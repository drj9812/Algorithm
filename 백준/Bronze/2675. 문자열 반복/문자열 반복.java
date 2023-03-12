import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < a; i++) {
				String[] sArr = br.readLine().split(" ");
				int b = Integer.parseInt(sArr[0]);
				String s = sArr[1];
				
				for (int j = 0; j < s.length(); j++) {
					for (int k = 0; k < b; k++) {
						System.out.print(s.charAt(j));
					}
				}
				System.out.println(); 
			}
		}
	}