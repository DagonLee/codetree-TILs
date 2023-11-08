import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int n, m, k;
    static int[][] grid;
    static boolean inRange(int tx, int ty, int sx, int sy, int ex, int ey){
        return sx <= tx && tx <= ex && sy <= ty && ty <= ey;
    }

    static void rotate(int x, int y, int rowLen, int colLen){
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int sx = x;
        int sy = y;
        if(rowLen == 1 || colLen == 1){
            return;
        }
        int tmp = grid[x][y];
        int d = 0;
        while(d < 4){
            int nx = sx + dx[d];
            int ny = sy + dy[d];
            if(!inRange(nx, ny, x, y, x + rowLen - 1, y + colLen - 1)){
                d++;
                continue;
            }
            grid[sx][sy] = grid[nx][ny];
            sx = nx;
            sy = ny;
        }
        grid[x + 1][y] = tmp;        
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        grid = new int[n][m];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 1. 각 사각형의 왼쪽 위가 기준으로 회전
        // 2. 반복 횟수는 행 또는 열의 최소의 / 2
        // 3. 사각형의 길이는 n - 2 * 반복 횟수
        for(int t = 0; t < k; t++){
            for(int i = 0; i < Math.min(n,m) / 2; i++){
                rotate(i, i, n - (i * 2), m - (i * 2));
            } 
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}