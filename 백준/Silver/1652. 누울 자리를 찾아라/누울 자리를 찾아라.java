import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int width = 0;
		int height = 0;
		String str = "";
		
		for (int i = 0; i < n; i++) {
			String strWidth = br.readLine();
			str += strWidth + ""; //
			String[] arrWidth = strWidth.split("X");
			for (int j = 0; j < arrWidth.length; j++) {
				if (arrWidth[j].length() >= 2) {
					width++;
				}
			}
		}
		for (int k = 0; k < n; k++) {
			String strHeight = "";
			for (int l = k; l < str.length(); l += n) {
				strHeight += str.charAt(l) + "";
			}
			String[] arrHeight = strHeight.split("X");
			for (int m = 0; m < arrHeight.length; m++) {
				if (arrHeight[m].length() >= 2) {
					height++;
				}
			}
		}
		System.out.println(width + " " + height);
	}
}