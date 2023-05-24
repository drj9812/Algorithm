import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n = br.readLine();
		String[] sArr = n.split("");
		
		int sum = 0;
		
		for (int i = 0; i < sArr.length; i++) {
			sum += Integer.parseInt(sArr[i]);
		}
		
        Arrays.sort(sArr, Collections.reverseOrder());
        
		if (sum % 3 == 0 && sArr[sArr.length - 1].equals("0")) {
			for (String x : sArr) {
				System.out.print(x);
			}
            
		} else {
			System.out.println(-1);
			
		}
	}
}