import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = scanner.nextInt();
        int diff = scanner.nextInt();
        
        int score1 = (sum + diff) / 2; // 득점을 많이 한 쪽
        int score2 = (sum - diff) / 2; // 득점을 적게 한 쪽
        
        if (sum >= diff && (sum + diff) % 2 == 0 && (sum - diff) % 2 == 0) {
            System.out.println(Math.max(score1, score2) + " " + Math.min(score1, score2));
        } else {
            System.out.println("-1");
        }
        
        scanner.close();
    }
}