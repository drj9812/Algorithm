import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] hambergerArr = new int[3];
		int[] drinkArr = new int[2];
		
		for (int i = 0; i < hambergerArr.length; i++) {
			hambergerArr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int j = 0; j < drinkArr.length; j++) {
			drinkArr[j] = Integer.parseInt(br.readLine());
		}
		
		int hambergerMin = hambergerArr[0];
		for (int k = 1; k < hambergerArr.length; k++) {
			if (hambergerMin > hambergerArr[k]) {
				hambergerMin = hambergerArr[k];
			}
		}
		
		int drinkMin = drinkArr[0];
		for (int l = 1; l < drinkArr.length; l++) {
			if (drinkMin > drinkArr[l]) {
				drinkMin = drinkArr[l];
			}
		}
		
		System.out.println(hambergerMin + drinkMin - 50);
	}
}
