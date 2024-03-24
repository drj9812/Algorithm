import java.io.*;
 
public class Main {
 
	public static StringBuilder strBuilder = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader bfrReader = new BufferedReader(new InputStreamReader(System.in));
 
		int n = Integer.parseInt(bfrReader.readLine());
 
		strBuilder.append((int) (Math.pow(2, n) - 1)).append('\n');
 
		solveTowerOfHanoi(n, 1, 2, 3);
		System.out.println(strBuilder);
	}
 
 
	public static void solveTowerOfHanoi(int n, int start, int mid, int end) {
		if (n == 1) {
			strBuilder.append(start + " " + end + "\n");
			return;
		}
 
		solveTowerOfHanoi(n - 1, start, end, mid);
		strBuilder.append(start + " " + end + "\n");
		solveTowerOfHanoi(n - 1, mid, start, end);
	}
}