import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String userInfo = br.readLine();
			
			if (userInfo.equals("# 0 0")) {
				break;
			}
			
			String[] list = userInfo.split(" ");
			
			if (Integer.parseInt(list[1]) > 17 || Integer.parseInt(list[2]) >= 80) {
				System.out.println(list[0] + " Senior");
			} else {
				System.out.println(list[0] + " Junior");
			}
			
			if (userInfo.equals("# 0 0")) {
				break;
			}
		}
	}
}