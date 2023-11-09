import java.io.*;
import java.util.*;

public class Main {
    static double n;

    public static void main(String[] args) throws IOException{
        TreeMap<String, Double> map = new TreeMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Double.parseDouble(br.readLine());
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0.0000) + 1);

        }
        Iterator<Map.Entry<String, Double>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Double> entry = it.next();
            System.out.println(entry.getKey() + " " + String.format("%.4f",(entry.getValue() / n) * 100));
        }
        
    }
}