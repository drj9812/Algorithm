import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			boolean[] bArr = new boolean[31];
			
			for (int i = 0; i < 28; i++) {
				int student = Integer.parseInt(br.readLine());
				bArr[student] = true;
				
			}
			
			for (int j = 1; j < bArr.length; j++) {
				if (bArr[j]==false) {
					System.out.println(j);
				}
			}
		}
	}