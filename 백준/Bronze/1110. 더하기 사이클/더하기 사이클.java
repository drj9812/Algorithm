import java.io.*;
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int a = Integer.parseInt(br.readLine());
            int cnt = 0;
            int copy = a;
            
            while (true) {
                a = ((a%10)*10+((a/10)+(a%10))%10);
                cnt++;
                if (copy==a){
                    break;
                }
            }
            System.out.println(cnt);
            
        }
    }