import java.io.*;
import java.util.*;

public class Main {
    static int n, m;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int val = Integer.parseInt(st.nextToken());
            set.add(val);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            int val = Integer.parseInt(st.nextToken());
            if(set.contains(val)){
                set.remove(val);
            }
            else{
                set.add(val);
            }
        }
        System.out.println(set.size());

    }
}