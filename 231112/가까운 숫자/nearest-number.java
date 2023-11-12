import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dist = 10^9;
        for(int i = 0; i < n ;i++){
            int val = Integer.parseInt(st.nextToken());
            set.add(val);
            if(set.higher(val) != null){
                dist = Math.min(set.higher(val) - val, dist);
            }
            if(set.lower(val) != null){
                dist = Math.min(val - set.lower(val), dist);
            }
            System.out.println(dist);
        }
    }
}