import java.io.*;

public class Main {
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    
    for (int i = 0; i < n; i++) {
        String input = br.readLine();
        System.out.println(input.charAt(0) + "" + input.charAt(input.length() - 1) + "");
    }
  }
}