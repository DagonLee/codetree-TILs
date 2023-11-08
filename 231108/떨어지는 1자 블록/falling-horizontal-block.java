import java.io.*;
import java.util.*;

public class Main {
    static int n, m, k;
    static int[][] grid;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken()) - 1;
        grid = new int[n][n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int selectedRow = -1;
        for(int i = 1; i < n; i++){
            boolean blocked = false;
            for(int j = k; j < k + m; j ++){
                if(grid[i][j] == 1){
                    selectedRow = i - 1;
                    blocked = true;
                }
            }
            if(blocked) break;
        }
        if(selectedRow != -1){
            for(int j = k; j < k + m; j++){
                grid[selectedRow][j] = 1;
            }
        }
        else{
            for(int j = k; j < k + m; j++){
                grid[0][j] = 1;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}