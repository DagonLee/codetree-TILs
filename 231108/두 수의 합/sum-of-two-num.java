import java.io.*;
import java.util.*;

public class Main {
    static int n, k;
    static HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int val = Integer.parseInt(st.nextToken());
            nums[i] = val;
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for(int i = 0; i < n; i++){
            int target = k - nums[i];
            if(map.containsKey(target)){
                cnt+= map.get(nums[i]) * map.get(target);
            }
        }
        System.out.println(cnt / 2);
    }
}