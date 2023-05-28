import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] sArr = input.split(" ");
		
		String str = "";
		
		for (int i = 0; i < sArr.length; i++) {
			str += sArr[i];
		}
		
		if (str.equals("12345678")) {
			System.out.println("ascending");
		} else if (str.equals("87654321")) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}