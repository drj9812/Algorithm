import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] alphabet = new int[26];
			String str = br.readLine().toUpperCase();
			String[] sArr = str.split("");
			
			for (int i = 0; i < sArr.length; i++) {
				alphabet[(int)(sArr[i].charAt(0))-65]++;
			}
			
			int max = 0;
			int maxIndex = 0;
			
			for (int j = 0; j < alphabet.length; j++) {
				if (alphabet[j] > max) {
					max = alphabet[j];
					maxIndex = j;
				}
			}
			
			maxIndex += 65;
			char ch = (char)maxIndex;
			int cnt = 0;
			
			for (int k = 0; k < alphabet.length; k++) {
				if (alphabet[k] == max) {
					cnt++;
				}
			}
			
			if (cnt > 1) {
				System.out.println("?");
			} else {
				System.out.println(ch);
			}
		}
	}