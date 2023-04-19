import java.io.*;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<String> rainbowDancers = new HashSet<String>();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			String[] inputList = input.split(" ");
			
			if (inputList[0].equals("ChongChong") || inputList[1].equals("ChongChong")) {
				rainbowDancers.add(inputList[0]);
				rainbowDancers.add(inputList[1]);
			}
			
			if (rainbowDancers.contains("ChongChong")) {
				if (rainbowDancers.contains(inputList[0]) || rainbowDancers.contains(inputList[1])) {
					rainbowDancers.add(inputList[0]);
					rainbowDancers.add(inputList[1]);
				}
			}
		}
		
		System.out.println(rainbowDancers.size());
	}
}