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
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        Set<Integer>keySet = map.keySet();
        for(int key: keySet){
            int target = k - key;
            if(map.containsKey(target)){
                if(target == key){
                    int cnt = map.get(target);
                    sum += ((cnt * (cnt - 1)));
                }
                else{
                    sum += (map.get(key) * map.get(target));
                }
            }
        }
        System.out.println(sum / 2);
    }
}