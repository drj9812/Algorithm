import java.io.*;
import java.util.Arrays;

public class Main {

	private static StringBuilder strBuilder;
	private static String[][] stars;

	public static void main(String[] args) throws IOException {
		BufferedReader bfrReader = new BufferedReader(new InputStreamReader(System.in));
		strBuilder = new StringBuilder();

		int n = Integer.parseInt(bfrReader.readLine());

		stars = new String[n][n];
		Arrays.stream(stars).forEach(row -> Arrays.fill(row, " "));

		printStars(0, 0, n);

		for (int i = 0; i < stars.length; i++) {
			for (int j = 0; j < stars[i].length; j++) {
				strBuilder.append(stars[i][j]);
			}
			strBuilder.append("\n");
		}

		System.out.println(strBuilder.toString());
	}

	private static void printStars(int x, int y, int size) {
		if (size == 1) {
			stars[x][y] = "*";
			
			return;
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!(i == 1 && j == 1)) {
					printStars(x + i * (size / 3), y + j * (size / 3), size / 3);
				}
			}
		}
	}
}