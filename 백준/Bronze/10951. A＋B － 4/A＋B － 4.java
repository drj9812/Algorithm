import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer str;
			String Input;
			while ((Input = br.readLine()) != null ) {
				str = new StringTokenizer(Input);
				int a = Integer.parseInt(str.nextToken());
				int b = Integer.parseInt(str.nextToken());
				
				bw.write(a+b+"\n");
			}

			br.close();
			bw.close();
		}
	}