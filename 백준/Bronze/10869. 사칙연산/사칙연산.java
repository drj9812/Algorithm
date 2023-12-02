import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int plus = a + b;
        int subtract = a - b;
        int multiply = a * b;
        int devide = a / b;
        int remainder = a % b;
        
        System.out.println(plus);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(devide);
        System.out.println(remainder);
    }
} 