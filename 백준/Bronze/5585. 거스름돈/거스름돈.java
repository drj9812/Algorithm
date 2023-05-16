import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int payment = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        int change = 1000 - payment;
        
        cnt = change / 500;
        change %= 500;
        
        cnt += change / 100;
        change %= 100;
        
        cnt += change / 50;
        change %= 50;
        
        cnt += change / 10;
        change %= 10;
        
        cnt += change / 5;
        change %= 5;
        
        cnt += change / 1;
        change %= 1;
        
        System.out.println(cnt);
    }
}