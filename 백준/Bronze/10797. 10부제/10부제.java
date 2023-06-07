import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int day = Integer.parseInt(br.readLine());
        StringTokenizer tkn = new StringTokenizer(br.readLine());
        
        int cnt = 0;
        
        for (int i = 0; i < 5; i++) {
            if (day == Integer.parseInt(tkn.nextToken())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}