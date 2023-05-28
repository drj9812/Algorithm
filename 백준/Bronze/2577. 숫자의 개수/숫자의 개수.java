import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		String axbxc = a * b * c + "";
		String[] sArr = axbxc.split("");
		
		int[] iArr = new int[10];
		
		for (int i = 0; i < sArr.length; i++) {
			switch (sArr[i]) {
			case "0" :
				iArr[0]++;
				break;
			case "1" :
				iArr[1]++;
				break;
			case "2" :
				iArr[2]++;
				break;
			case "3" :
				iArr[3]++;
				break;
			case "4" :
				iArr[4]++;
				break;
			case "5" :
				iArr[5]++;
				break;
			case "6" :
				iArr[6]++;
				break;
			case "7" :
				iArr[7]++;
				break;
			case "8" :
				iArr[8]++;
				break;
			case "9" :
				iArr[9]++;
				break;
			}
		}
		
		for (int j = 0; j < iArr.length; j++) {
			System.out.println(iArr[j]);
		}
	}
}