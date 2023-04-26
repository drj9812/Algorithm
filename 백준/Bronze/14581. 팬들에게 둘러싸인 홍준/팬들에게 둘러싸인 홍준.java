import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        
        System.out.println(":fan::fan::fan:");
        System.out.print(":fan::" + input);
        System.out.println("::fan:");
        System.out.println(":fan::fan::fan:");
    }
}