import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] sArr = s.split("");
		
		int zeroCnt = 0;
		int oneCnt = 0;
		
		for (int i = 0; i < sArr.length - 1; i++) {
			if (!sArr[i].equals(sArr[i + 1])) {
				if (sArr[i].equals("0")) {
					zeroCnt++;
				} else {
					oneCnt++;
				}
			}
		}
		if (zeroCnt <= oneCnt) {
			System.out.println(oneCnt);			
		} else {
			System.out.println(zeroCnt);			
		}
	}
}