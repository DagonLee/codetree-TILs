import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 1; i <= n; i++){
            int val = Integer.parseInt(st.nextToken());
            if(!map.containsKey(val)){
                map.put(val, i);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}