import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] coordinates = new String[n];
		
		for (int i = 0; i < coordinates.length; i++) {
			coordinates[i] = br.readLine();
		}
		
		Arrays.sort(coordinates, new Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		        String[] coordinate1 = s1.split(" ");
		        String[] coordinate2 = s2.split(" ");

		        int x1 = Integer.parseInt(coordinate1[0]);
		        int y1 = Integer.parseInt(coordinate1[1]);
		        int x2 = Integer.parseInt(coordinate2[0]);
		        int y2 = Integer.parseInt(coordinate2[1]);

		        if (y1 != y2) {
		            return Integer.compare(y1, y2);
		        } else {
		            return Integer.compare(x1, x2);
		        }
		    }
		});
		
		for (String str : coordinates) {
			System.out.println(str);
		}
	}
}