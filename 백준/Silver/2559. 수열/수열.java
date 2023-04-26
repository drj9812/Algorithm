import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(tkn.nextToken());
		int[] temperatures = new int[n];
		
		int k = Integer.parseInt(tkn.nextToken());
		
		tkn = new StringTokenizer(br.readLine());
		
		temperatures[0] = Integer.parseInt(tkn.nextToken());
		int min = temperatures[0];
		
		for (int i = 1; i < temperatures.length; i++) {
			temperatures[i] = Integer.parseInt(tkn.nextToken());
			if (min > temperatures[i]) {
				min = temperatures[i];
			}
		}
		
		int maxSum = twoPointer(temperatures, min, k);
		
		System.out.println(maxSum);
	}

	private static int twoPointer(int[] temperatures, int min, int k) {
	    ArrayList<Integer> intervalSums = new ArrayList<>();
	    
	    int left = 0;
	    int right = 0;
	    int currentSum = 0;
	        
	    while (right < temperatures.length) {
	        if (right - left > k) {
	            currentSum -= temperatures[left++];
	            
	        } else if (right - left < k) {
	            currentSum += temperatures[right++];
	            
	        } else if (right - left == k) {
	            intervalSums.add(currentSum);
	            currentSum -= temperatures[left++];

	        }
	        
	        if (right == temperatures.length) {
	        	intervalSums.add(currentSum);
	        }
	    }
	    
	    int maxSum = min;
	    
	    if (intervalSums.size() != 1) {
	    	for (Integer sum : intervalSums) {
	    		if (sum > maxSum) {
	    			maxSum = sum;
	    		}
	    	}
	    } else {
	    	maxSum = intervalSums.get(0);
	    }
	    
	    return maxSum;
	}
}