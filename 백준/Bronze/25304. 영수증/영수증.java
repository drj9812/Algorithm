import java.util.*;
    public class Main {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int n = scanner.nextInt();
            int sum = 0;
            
            for (int i = 1; i <= n; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                sum += a*b;
            }
            if (x==sum) {
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }
        }
    }