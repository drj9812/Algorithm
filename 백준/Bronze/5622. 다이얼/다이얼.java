import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] sArr = br.readLine().split("");
			int sum = 0;
			
			for (int i = 0; i < sArr.length; i++) {
				if ('A' <= sArr[i].charAt(0) && sArr[i].charAt(0) <= 'C') {
					sArr[i] = "3";
					sum += Integer.parseInt(sArr[i]);
				}	else if ('D' <= sArr[i].charAt(0) && sArr[i].charAt(0) <= 'F') {
					sArr[i] = "4";
					sum += Integer.parseInt(sArr[i]);
				}	else if ('G' <= sArr[i].charAt(0) && sArr[i].charAt(0) <= 'I') {
					sArr[i] = "5";
					sum += Integer.parseInt(sArr[i]);
				} 	else if ('J' <= sArr[i].charAt(0) && sArr[i].charAt(0) <= 'L') {
					sArr[i] = "6";
					sum += Integer.parseInt(sArr[i]);
				}	else if ('M' <= sArr[i].charAt(0) && sArr[i].charAt(0) <= 'O') {
					sArr[i] = "7";
					sum += Integer.parseInt(sArr[i]);
				}	else if ('P' <= sArr[i].charAt(0) && sArr[i].charAt(0) <= 'S') {
					sArr[i] = "8";
					sum += Integer.parseInt(sArr[i]);
				}	else if ('T' <= sArr[i].charAt(0) && sArr[i].charAt(0) <= 'V') {
					sArr[i] = "9";
					sum += Integer.parseInt(sArr[i]);
				}	else if ('W' <= sArr[i].charAt(0) && sArr[i].charAt(0) <= 'Z') {
					sArr[i] = "10";
					sum += Integer.parseInt(sArr[i]);
				}
			}
			System.out.println(sum);
		}
	}