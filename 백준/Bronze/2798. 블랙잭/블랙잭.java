import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(tkn.nextToken());
		int[] cardList = new int[n];
		int m = Integer.parseInt(tkn.nextToken());

		tkn = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			cardList[i] = Integer.parseInt(tkn.nextToken());
		}

		int sum = 0;
		int max = 0;
		
		loop : for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {
				for (int l = k + 1; l < n; l++) {
					 if (cardList[j] +  cardList[k] + cardList[l] < m) {
						sum = cardList[j] +  cardList[k] + cardList[l];
						if (sum > max) {
							max = sum;
						}
					}
					 
					 if(cardList[j] +  cardList[k] + cardList[l] == m) {
							max = m;
							break loop;
						} 
				}
			}
		}
		System.out.println(max);
	}
}