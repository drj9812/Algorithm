import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tkn = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(tkn.nextToken());
        int[] sequence = new int[n];
        int q = Integer.parseInt(tkn.nextToken());
        
        tkn = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(tkn.nextToken());
        }
        
        Arrays.sort(sequence);
        int[] prefixSum = getPrefixSum(sequence);
        
        for (int j = 0; j < q; j++) {
            tkn = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(tkn.nextToken());
            int endIndex = Integer.parseInt(tkn.nextToken());
            
            System.out.println(getIntervalSum(prefixSum, startIndex, endIndex));
        }
    }
    
    private static int[] getPrefixSum(int[] sequence) {
        int[] prefixSum = new int[sequence.length];
        prefixSum[0] = sequence[0];
        
        for (int i = 1; i < sequence.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + sequence[i];
        }
        
        return prefixSum;
    }
    
    private static int getIntervalSum(int[] prefixSum, int startIndex, int endIndex) {
        if (startIndex == 1) {
            return prefixSum[endIndex - 1];
        }
        
        return prefixSum[endIndex - 1] - prefixSum[startIndex - 2];
    }
}