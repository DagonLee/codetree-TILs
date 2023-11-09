import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeMap<String, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++){
            String input = br.readLine();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}