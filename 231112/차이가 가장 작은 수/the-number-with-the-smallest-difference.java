import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 1. 수를 넣으면서 자신보다 큰 수와 작은 수를 비교하여 차이 갱신
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m;
        int dist = Integer.MAX_VALUE;
        TreeSet<Integer> set = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n ;i++){
            int val = Integer.parseInt(br.readLine());
            int low = val - m;
            int high = val + m;
            if(set.ceiling(high) != null){
                int dif = set.ceiling(high) - val;
                dist = Math.min(dist, dif);
            }
            if(set.floor(low) != null){
                int dif = val - set.floor(low);
                dist = Math.min(dist, dif);
            }
            set.add(val);
        }
        if(dist == Integer.MAX_VALUE){
            System.out.println(-1);
            return;
        }
        System.out.println(dist);
    }
}