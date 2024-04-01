import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bfrReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfrWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer strTokenizer;

		int n = Integer.parseInt(bfrReader.readLine());
		int[] numbers = new int[n];

		strTokenizer = new StringTokenizer(bfrReader.readLine());

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(strTokenizer.nextToken());
		}

		int[] copyNumbers = Arrays.copyOf(numbers, n);
		TreeMap<Integer, Integer> sortNumbers = new TreeMap<>();

		Arrays.sort(copyNumbers);
		int count = 0;

		for (int i = 0; i < copyNumbers.length; i++) {
			if (sortNumbers.containsKey(copyNumbers[i])) {
				count++;
				continue;
				
			} else {
				sortNumbers.put(copyNumbers[i], i - count);
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			bfrWriter.write(sortNumbers.get(numbers[i]) + " ");
		}
		
		bfrReader.close();
		bfrWriter.flush();
		bfrWriter.close();
	}
}
