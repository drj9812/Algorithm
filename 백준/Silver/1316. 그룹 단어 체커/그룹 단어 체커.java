import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());
			int cnt = a;
			
			loop1 : for (int i = 0; i < a; i++) {
				String str = br.readLine();
				String[] sArr = str.split("");
				for (int j = 0; j < sArr.length; j++) {
					if (j == sArr.length - 1) {
						break;
					} else {
						if (!sArr[j].equals(sArr[j+1])) {
							for (int k = j + 2; k < sArr.length; k++) {
								if (sArr[j].equals(sArr[k])) {
									cnt--;
									continue loop1;
								}
							}
						}
					}
				}
				
			}
			System.out.println(cnt);
		}
	}