import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[n];
        StringTokenizer tkn = new StringTokenizer(br.readLine());

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(tkn.nextToken());
        }

        int k = Integer.parseInt(br.readLine());
        int groupSize = n / k;
        
        for (int i = 0; i < n; i += groupSize) {
			Arrays.sort(scores, i, i + groupSize);
		}

        for (int m = 0; m < scores.length; m++) {
            System.out.print(scores[m] + " ");
        }
    }
}