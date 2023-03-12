import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer str;	

			while (true) {
				str = new StringTokenizer(br.readLine());	
			    int a = Integer.parseInt(str.nextToken());
			    int b = Integer.parseInt(str.nextToken());

			    if (a+b==0) {
			    	break;
			    }
			    bw.write(a+b+"\n");

			}
			br.close();
			bw.close();
		}
	}