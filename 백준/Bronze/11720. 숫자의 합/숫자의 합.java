import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());
			int[] iArr = new int[a];
			String num = br.readLine();
			int sum = 0;
			
			for ( int i = 0; i < iArr.length; i++) {
				iArr[i] = (num.charAt(i)-'0');
				sum += iArr[i];
			}
			
			System.out.println(sum);
			
		}
	}