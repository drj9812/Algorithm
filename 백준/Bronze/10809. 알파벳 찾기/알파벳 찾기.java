import java.io.*;
import java.util.Arrays;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] alphabet = new int[26];
			Arrays.fill(alphabet, -1);
			
			String a = br.readLine();
			
			for ( int i = 0; i < a.length(); i++) {
				char b = a.charAt(i);
				int tmp = 0;
				tmp = (int)b;
				tmp -= 97;
				
				if ( alphabet[tmp] == -1) {
					alphabet[tmp] = i;
				}
				
			}
			for ( int j = 0; j < alphabet.length; j++ ) {
				System.out.print(alphabet[j] + " ");
			}
		}
	}