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
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int val = Integer.parseInt(st.nextToken());
            nums[i] = val;
        }
        for(int i = 0; i < n; i++){
            int dif = k - nums[i];
            if(map.containsKey(dif)){
                sum += map.get(dif);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        System.out.println(sum);
    }
}