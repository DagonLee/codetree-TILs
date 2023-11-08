import java.io.*;
import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            char[] charList = str.toCharArray();
            Arrays.sort(charList);
            String result = new String(charList);
            map.put(result, map.getOrDefault(result, 0) + 1);
            ans = Math.max(map.get(result), ans);
        }
        System.out.print(ans);
    }
}