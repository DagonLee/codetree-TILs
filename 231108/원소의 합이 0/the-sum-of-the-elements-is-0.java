import java.io.*;
import java.util.*;

public class Main {
    static int[][] nums;
    static int n;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = new int[4][n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i = 0; i < 4; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int val = nums[0][i] + nums[1][j];
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int val = nums[2][i] + nums[3][j];
                if(map.containsKey(-val)){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}