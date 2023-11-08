import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int n;
    static final long MAX = 1000000000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        HashMap<Long, Long> map = new HashMap<>();
        for(int i = 0; i < n ;i++){
            st = new StringTokenizer(br.readLine());
            long x = Integer.parseInt(st.nextToken());
            long y = Integer.parseInt(st.nextToken());
            map.put(x, Math.min(map.getOrDefault(x,MAX),y));
        }
        int ans = 0;
        Set<Long> keySet = map.keySet();
        for(long key:keySet){
            ans += map.get(key);
        }
        System.out.println(ans);
    }
}