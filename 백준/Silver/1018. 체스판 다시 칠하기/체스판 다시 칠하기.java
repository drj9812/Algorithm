import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tkn = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(tkn.nextToken());
		int m = Integer.parseInt(tkn.nextToken());
		String[][] chessBoard = new String[n][m];

		for (int i = 0; i < chessBoard.length; i++) {
			String input = br.readLine();
			chessBoard[i] = input.split("");

		}

		int minCnt = setRange(chessBoard);

		System.out.println(minCnt);

	}

	private static int cntWhiteRec(String[][] chessBoard, int a, int b) {
		int cnt = 0;

		for (int i = a; i < 8 + a; i++) {
			for (int j = b; j < 8 + b; j++) {
				if ((i - a) % 2 == 0) { // 짝수행
					if ((j - b) % 2 == 0) { // 짝수열
						if (!chessBoard[i][j].equals("W")) {
							cnt++;
						}
					} else { // 홀수열
						if (!chessBoard[i][j].equals("B")) {
							cnt++;
						}
					}
				} else { // 홀수행
					if ((j - b) % 2 == 0) { // 짝수열
						if (!chessBoard[i][j].equals("B")) {
							cnt++;
						}
					} else { // 홀수열
						if (!chessBoard[i][j].equals("W")) {
							cnt++;
						}
					}
				}
			}
		}
		return cnt;
	}
	
	private static int cntBlackRec(String[][] chessBoard, int a, int b) {
		int cnt = 0;

		for (int i = a; i < 8 + a; i++) {
			for (int j = b; j < 8 + b; j++) {
				if ((i - a) % 2 == 0) { // 짝수행
					if ((j - b) % 2 == 0) { // 짝수열
						if (!chessBoard[i][j].equals("B")) {
							cnt++;
						}
					} else { // 홀수열
						if (!chessBoard[i][j].equals("W")) {
							cnt++;
						}
					}
				} else { // 홀수행
					if ((j - b) % 2 == 0) { // 짝수열
						if (!chessBoard[i][j].equals("W")) {
							cnt++;
						}
					} else { // 홀수열
						if (!chessBoard[i][j].equals("B")) {
							cnt++;
						}
					}
				}
			}
		}
		return cnt;
	}
	

	private static int setRange(String[][] ChessBoard) {
		int min = 64;

		for (int a = 0; a <= ChessBoard.length - 8; a++) {
			for (int b = 0; b <= ChessBoard[a].length - 8; b++) {
				int cntW = cntWhiteRec(ChessBoard, a, b);
				int cntB = cntBlackRec(ChessBoard, a, b);
				if (cntW < cntB) {
					if (cntW < min) {
						min = cntW;
					}
				} else {
					if (cntB < min) {
						min = cntB;
					}
				}
			}
		}
		return min;
	}
}