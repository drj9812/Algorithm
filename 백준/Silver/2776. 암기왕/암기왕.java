import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int[] list = new int[n];
			
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < n; j++) {
				list[j] = Integer.parseInt(str.nextToken());
			}
			
			Arrays.sort(list);
			
			int m = Integer.parseInt(br.readLine());
			
			str = new StringTokenizer(br.readLine());
						
			 for (int k = 0; k < m; k++) {
	                int target = Integer.parseInt(str.nextToken());
	                int result = binarySearch(list, target);
	                sb.append(result).append('\n');
	            }
	        }

	        System.out.println(sb);
		}
	
	 public static int binarySearch(int[] arr, int target) {
	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;

	            if (arr[mid] == target) {
	                return 1;
	            } else if (arr[mid] < target) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return 0;
	    }
}