import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] formula = input.split("");
		
		StringBuilder sb = new StringBuilder();
		int currentSum = 0;
		int finalSum = 0;
		int cnt = 0;
		
		for (int i = formula.length - 1; i >= 0; i--) {
			if (formula[i].matches("\\d{1}")) {
				sb.append(formula[i]);
				if (i == 0) {
					currentSum += Integer.parseInt(sb.reverse() + "");
					finalSum += currentSum;
				}
				
			} else {
				if (formula[i].equals("-")) {
					currentSum += Integer.parseInt(sb.reverse() + "");
					finalSum += -currentSum;
					currentSum = 0;
					sb.setLength(0);
					cnt++;
					
				} else if (formula[i].equals("+")) {
					currentSum += Integer.parseInt(sb.reverse() + "");
					sb.setLength(0);
				}
			}
		}
		
		if (cnt == 0) {
			System.out.println(currentSum);
		} else {
			System.out.println(finalSum);
			
		}
	}
}
