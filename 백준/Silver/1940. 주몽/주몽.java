import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] ingredients = new int[n];
		
		StringTokenizer tkn = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			ingredients[i] = Integer.parseInt(tkn.nextToken());
		}
		
		Arrays.sort(ingredients);
		
		int cnt = twoPointer(ingredients, m);
		
		System.out.println(cnt);
	}
	
	private static int twoPointer(int[] ingredients, int target) {
		int left = 0;
		int right = ingredients.length - 1;
		int cnt = 0;
		
		while (left < right) {
			if (ingredients[left] + ingredients[right] < target) {
				left++;
			} else if (ingredients[left] + ingredients[right] > target) {
				if (ingredients[left + 1] - ingredients[left] > ingredients[right] - ingredients[right]) {
					right--;
				} else {
					left++;
				}
			} else if (ingredients[left] + ingredients[right] == target) {
				cnt++;
				left++;
			}
		}
		return cnt;
	}
}
