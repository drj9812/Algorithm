import java.io.*;
import java.util.Arrays;

public class Main {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int n = Integer.parseInt(br.readLine());
      int[] products = new int[n];
      
      for (int i = 0; i < n; i++) {
         products[i] = Integer.parseInt(br.readLine());
      }
      
      Arrays.sort(products);
      
      int breakIndex = n % 3;
      int cnt = 0;
      int sum = 0;
      
      for (int j = n - 1; j >= breakIndex; j--) {
         cnt++;
         if (cnt < 3) {
            sum += products[j];
         } else {
            cnt = 0;
         }
      }
      
      for (int k = breakIndex - 1; k >= 0; k--) {
    	  sum += products[k];
      }
      
      System.out.println(sum);
   }
}