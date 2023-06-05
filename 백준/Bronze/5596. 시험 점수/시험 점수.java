import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores1 = new int[4];
        int[] scores2 = new int[4];

        int total1 = 0;
        int total2 = 0;
        
        for (int i = 0; i < 4; i++) {
            scores1[i] = scanner.nextInt();
            total1 += scores1[i];
        }

        for (int i = 0; i < 4; i++) {
            scores2[i] = scanner.nextInt();
            total2 += scores2[i];
        }

        if (total1 >= total2) {
            System.out.println(total1);
        } else {
            System.out.println(total2);
        }
    }
}