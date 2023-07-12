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

        sortScores(scores, k);

        for (int m = 0; m < scores.length; m++) {
            System.out.print(scores[m] + " ");
        }
    }

    private static void sortScores(int[] scores, int k) {
        int n = scores.length;
        int groupSize = n / k;

        for (int i = 0; i < k; i++) {
            Arrays.sort(scores, i * groupSize, (i + 1) * groupSize);
        }
    }
}