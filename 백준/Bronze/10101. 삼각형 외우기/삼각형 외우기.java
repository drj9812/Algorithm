import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] angle = new int[3];

		int sum = 0;

		for (int i = 0; i < angle.length; i++) {
			int a = Integer.parseInt(br.readLine());
			angle[i] = a;
			sum += a;
		}

		if (sum == 180) {
			if (angle[0] == 60 && angle[1] == 60 && angle[2] == 60) {
				System.out.println("Equilateral");
			} else if (angle[0] == angle[1] || angle[0] == angle[2] || angle[1] == angle[2]) {
				System.out.println("Isosceles");
			} else if (angle[0] != angle[1] && angle[0] != angle[2]) {
				System.out.println("Scalene");
			}
		} else {
			System.out.println("Error");
		}

	}
}