import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			boolean[] bArr = new boolean[42];
			int cnt = 0;
			
			for (int i = 0; i < 10; i++) {
				bArr[Integer.parseInt(br.readLine())%42] = true;
			}
			
			for (int j = 0; j < bArr.length; j++) {
				if (bArr[j]==true) {
					cnt++;
				}
			}
//			br.close();
//			bw.flush();
//			bw.write(cnt);
//			bw.close();
//			
			
			System.out.println(cnt);
		}
	}
	