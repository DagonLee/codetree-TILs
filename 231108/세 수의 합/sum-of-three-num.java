import java.io.*;
import java.util.*;

public class Main {
    static int n, k;
    static int[] nums;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int res = 0;
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        nums = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i < n; i++){
            int target = k - nums[i];
            if(map.containsKey(target)){
                res += map.get(target);
            }
            for(int j = 0; j < i; j++){
                map.put(nums[i] + nums[j], map.getOrDefault(nums[i] + nums[j],0) + 1);
            }
        }
        System.out.print(res);
    }
}