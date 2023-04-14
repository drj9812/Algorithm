import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[][] coordinateList = new int[3][2];

		for (int i = 0; i < coordinateList.length; i++) {
			StringTokenizer tkn = new StringTokenizer(br.readLine());
			for (int j = 0; j < coordinateList[i].length; j++) {
				coordinateList[i][j] = Integer.parseInt(tkn.nextToken());
			}
		}

		if (coordinateList[0][0] == coordinateList[1][0]) {
			sb.append(coordinateList[2][0] + " ");
		} else {
			if (coordinateList[0][0] == coordinateList[2][0]) {
				sb.append(coordinateList[1][0] + " ");
			} else {
				sb.append(coordinateList[0][0] + " ");
			}
		}
		
		if (coordinateList[0][1] == coordinateList[1][1]) {
			sb.append(coordinateList[2][1] + " ");
		} else {
			if (coordinateList[0][1] == coordinateList[2][1]) {
				sb.append(coordinateList[1][1] + " ");
			} else {
				sb.append(coordinateList[0][1] + " ");
			}
		}
		
		System.out.println(sb);
	}
}