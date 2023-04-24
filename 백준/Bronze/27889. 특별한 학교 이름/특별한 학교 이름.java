import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        
        if (input.equals("NLCS")) {
            System.out.print("North London Collegiate School");     
        } else if (input.equals("BHA")) {
            System.out.print("Branksome Hall Asia");
        } else if (input.equals("KIS")) {
            System.out.print("Korea International School");
        } else if (input.equals("SJA")) {
            System.out.print("St. Johnsbury Academy");
        }
    }
}