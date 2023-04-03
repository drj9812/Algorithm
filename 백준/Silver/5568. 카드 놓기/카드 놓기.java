import java.io.*;
import java.util.HashSet;

public class Main {
	private static int n;
	private static int[] cardList;
	private static int k;
	private static HashSet<String> cardCombination = new HashSet<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		cardList = new int[n];
		k = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			cardList[i] = Integer.parseInt(br.readLine());
		}

		pickCard(new boolean[n], 0, "");
		
		System.out.println(cardCombination.size());
	}

	public static void pickCard(boolean[] visited, int count, String cardString) {
		if (count == k) {
			cardCombination.add(cardString);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				pickCard(visited, count + 1, cardString + cardList[i] + "");
				visited[i] = false;
			}
		}
	}
}