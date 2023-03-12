import java.io.*;
import java.util.*;
   public class Main {
      public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());
         StringTokenizer str = new StringTokenizer(br.readLine());
         int L = Integer.parseInt(br.readLine());
         int cnt = 0;
         
         for (int i=0; i<n; i++) {
            int b = Integer.parseInt(str.nextToken());
            if(b==L) {
               cnt ++;
            }
         }
         System.out.println(cnt);
      }
   }