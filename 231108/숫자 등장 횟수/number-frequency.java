import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int n, m;
    static HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)){
                int prev = map.get(num);
                map.put(num, prev + 1);
            }
            else{
                map.put(num, 1);
            }
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            int val = Integer.parseInt(st.nextToken());
            if(map.containsKey(val)){
                System.out.print(map.get(val) + " ");
            }
            else{
                System.out.print(0 + " ");
            }
        }
    }
}