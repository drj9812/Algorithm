import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 0, 1, 0}; // 북, 동, 남, 서 방향으로 이동하기 위한 x 좌표 변화량
    static int[] dy = {0, 1, 0, -1}; // 북, 동, 남, 서 방향으로 이동하기 위한 y 좌표 변화량

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tkn = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tkn.nextToken());
        int m = Integer.parseInt(tkn.nextToken());
        int[][] rooms = new int[n][m];

        tkn = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(tkn.nextToken());
        int c = Integer.parseInt(tkn.nextToken());
        int d = Integer.parseInt(tkn.nextToken());

        for (int i = 0; i < n; i++) {
            tkn = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                rooms[i][j] = Integer.parseInt(tkn.nextToken());
            }
        }

        int cnt = getCleanRoomCount(rooms, r, c, d);
        System.out.println(cnt);
    }

    private static int getCleanRoomCount(int[][] rooms, int r, int c, int d) {
        int cnt = 0;
        while (true) {
            if (rooms[r][c] == 0) {
                cnt++;
                rooms[r][c] = 2; // 청소된 칸을 2로 표시
            }

            boolean canMove = false;

            // 4방향 중 청소할 수 있는 빈 칸이 있는지 확인
            for (int i = 0; i < 4; i++) {
                int nextDir = (d + 3) % 4; // 반시계 방향으로 90도 회전한 방향
                int nx = r + dx[nextDir]; // 다음 칸의 x 좌표
                int ny = c + dy[nextDir]; // 다음 칸의 y 좌표

                if (rooms[nx][ny] == 0) {
                    canMove = true;
                    r = nx;
                    c = ny;
                    d = nextDir;
                    break;
                }

                d = nextDir; // 다음 방향으로 회전
            }

            if (!canMove) { // 네 방향 모두 청소할 수 없는 경우
                int backDir = (d + 2) % 4; // 후진 방향입니다.
                int bx = r + dx[backDir]; // 후진할 칸의 x 좌표
                int by = c + dy[backDir]; // 후진할 칸의 y 좌표

                if (rooms[bx][by] == 1) { // 후진할 칸이 벽인 경우 종료
                    break;
                }

                r = bx;
                c = by;
            }
        }

        return cnt;
    }
}