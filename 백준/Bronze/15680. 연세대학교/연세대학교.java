import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Integer n = Integer.parseInt(br.readLine());
        
        if (n == 0) {
            System.out.println("YONSEI");
        } else if (n == 1) {
            System.out.println("Leading the Way to the Future");
        }
    }
}