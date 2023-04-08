import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(tkn.nextToken());
		int b = Integer.parseInt(tkn.nextToken());

		ArrayList<Integer> list = new ArrayList<>();

		tkn = new StringTokenizer(br.readLine());

		for (int i = 0; i < a; i++) {
			list.add(Integer.parseInt(tkn.nextToken()));
		}

		tkn = new StringTokenizer(br.readLine());
		
		for (int j = 0; j < b; j++) {
			list.add(Integer.parseInt(tkn.nextToken()));
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();

		for (Integer x : list) {
			sb.append(x + " ");
		}

		System.out.println(sb);
	}
}