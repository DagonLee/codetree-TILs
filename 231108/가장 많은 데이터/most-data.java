import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static HashMap<String, Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int max = 0;
        for(int i = 0; i < n; i++){
            String color = br.readLine();
            map.put(color, map.getOrDefault(color, 0) + 1);
            max = Math.max(max, map.get(color));
        }
        System.out.println(max);
    }
}