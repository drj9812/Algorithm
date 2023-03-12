import java.io.*;
import java.util.StringTokenizer;
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer str;
            int t = Integer.parseInt(br.readLine());
            
            for (int i = 1; i<=t; i++) {
                str = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(str.nextToken());
                int b = Integer.parseInt(str.nextToken());
                
                bw.write(a+b+"\n");
            }
            bw.close();
        }
    }