import java.io.*;
import java.util.StringTokenizer;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			double majorSubjectSum = 0;
			double creditSum = 0;
			
			for (int i = 0; i < 20; i++) {
				StringTokenizer str = new StringTokenizer(br.readLine());
				String[] sArr = new String[] {str.nextToken(), str.nextToken(), str.nextToken()};
				
				switch (sArr[2]) {
				case "A+" : majorSubjectSum += Double.parseDouble(sArr[1]) * 4.5;
							creditSum += Double.parseDouble(sArr[1]);
							break;
				case "A0" : majorSubjectSum += Double.parseDouble(sArr[1]) * 4.0;
							creditSum += Double.parseDouble(sArr[1]);
							break;
				case "B+" : majorSubjectSum += Double.parseDouble(sArr[1]) * 3.5;
							creditSum += Double.parseDouble(sArr[1]);
							break;
				case "B0" : majorSubjectSum += Double.parseDouble(sArr[1]) * 3.0;
							creditSum += Double.parseDouble(sArr[1]);
							break;
				case "C+" : majorSubjectSum += Double.parseDouble(sArr[1]) * 2.5;
							creditSum += Double.parseDouble(sArr[1]);
							break;
				case "C0" : majorSubjectSum += Double.parseDouble(sArr[1]) * 2.0;
							creditSum += Double.parseDouble(sArr[1]);
							break;
				case "D+" : majorSubjectSum += Double.parseDouble(sArr[1]) * 1.5;
							creditSum += Double.parseDouble(sArr[1]);
							break;
				case "D0" : majorSubjectSum += Double.parseDouble(sArr[1]) * 1.0;
							creditSum += Double.parseDouble(sArr[1]);
							break;
				case "F" : majorSubjectSum += Double.parseDouble(sArr[1]) * 0.0;
							creditSum += Double.parseDouble(sArr[1]);
							break;
				}
			}
			double evg = majorSubjectSum/creditSum;
			System.out.printf("%.6f", evg);
		}
	}