import java.io.*;
import java.util.*;

public class Main {
    static boolean printed = false;
    public static void main(String[] args) throws IOException{
        LinkedHashMap <Character, Integer> map = new LinkedHashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                return;
            }
        }        
        System.out.println("None");
    }
}