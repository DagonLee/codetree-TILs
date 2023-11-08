import java.io.*;
import java.util.*;

class Person{
    int x;
    int y;
    int time;
    int dir;
    Person(int x, int y, int time, int dir){
        this.x = x;
        this.y = y;
        this.time = time;
        this.dir = dir;
    }
}
public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int n;
    static char[][] grid;
    static boolean[][] visited;
    static StringTokenizer st;
    static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    static int move(int x, int y){
        Queue<Person> q = new LinkedList<>();
        q.add(new Person(x, y, 0, 0));
        visited = new boolean[n][n];
        visited[x][y] = true;
        while(!q.isEmpty()){
            Person now = q.poll();
            for(int d = 0 ; d > -3; d--){
                int dir = (now.dir + d + 4) % 4;
                int nx = now.x + dx[dir];
                int ny = now.y + dy[dir];
                if(!inRange(nx, ny)){
                    return now.time + 1;
                }
                if(visited[nx][ny]){
                    return -1;
                }
                if(grid[nx][ny] == '#'){
                    continue;
                }
                visited[nx][ny] = true;
                char right = grid[nx + dx[(dir + 1) % 4]][ny + dy[(dir + 1) % 4]];
                if(right == '#'){
                    q.add(new Person(nx, ny, now.time + 1, dir));
                    break;
                }
                else{
                    int nd = (dir + 1) % 4;
                    nx += dx[nd];
                    ny += dy[nd];
                    visited[nx][ny] = true;
                    q.add(new Person(nx, ny, now.time + 2, nd));
                    
                    break;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException{
        // 1. bfs를 통해 탐색
        // 2. 현재 방향으로 진출 했을 때 
        //   1) 우측에 벽이 있다면 전진
        //   2) 범위 밖이라면 탈출 및 시간 반환
        //   3) 벽에 닿은 공간이 아니라면 방향을 전환 하고 전진
        //   단 이미 방문 한 지점을 재방문하게 되면 -1 반환
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()) - 1;
        int y = Integer.parseInt(st.nextToken()) - 1;
        grid = new char[n][n];
        for(int i = 0; i < n; i++){
            String line = br.readLine();
            for(int j = 0; j < n; j++){
                grid[i][j] = line.charAt(j);
            }
        }
        System.out.println(move(x, y));
    }
}