import java.util.*;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            if (45<=m) {
            	System.out.println(h+" "+(m-45));
            } else if (h==0) {
            	System.out.println(23+" "+(m+15));
            } else {
            	System.out.println((h-1)+" "+(m+15));
            }

        }
    }