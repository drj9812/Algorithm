import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tkn = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tkn.nextToken());
        long[] kettles = new long[n];
        int k = Integer.parseInt(tkn.nextToken());

        long max = 0;

        for (int i = 0; i < kettles.length; i++) {
            kettles[i] = Integer.parseInt(br.readLine());
            if (max < kettles[i]) {
                max = kettles[i];
            }
        }

        if (n == 1 && k == 1) {
            System.out.println(kettles[0]);
        } else {
            System.out.println(binarySearch(kettles, max, k));
        }
    }

    private static long binarySearch(long[] kettles, long max, int target) {
        long left = 0;
        long right = max;

        long result = -1; // 이진 탐색의 결과를 저장할 변수

        while (left < right) {
            long mid = (left + right) / 2;
            if (divide(kettles, mid) >= target) {
                result = mid; // 현재 mid 값을 저장
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return result;
    }

    private static long divide(long[] kettles, long mid) {
        int numberOfPeople = 0;

        for (int i = 0; i < kettles.length; i++) {
            numberOfPeople += kettles[i] / mid;
        }

        return numberOfPeople;
    }
}