import java.io.*;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
        
		BufferedReader bfrReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfrWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int n = Integer.parseInt(bfrReader.readLine());
		int[] numbers = new int[n];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(bfrReader.readLine());
		}
		
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
            bfrWriter.write(Integer.toString(numbers[i]));
            bfrWriter.newLine();
		}
		
		bfrWriter.flush();
		bfrWriter.close();
		bfrReader.close();
	}
}