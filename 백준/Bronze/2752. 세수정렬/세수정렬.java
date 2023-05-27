import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tkn = new StringTokenizer(br.readLine());
        
        int[] arr = new int[3];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tkn.nextToken());
        }
        
        Arrays.sort(arr);
        
        for (int j = 0; j < arr.length; j++) {
        	System.out.print(arr[j] + " ");
        }
    }
}