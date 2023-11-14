import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < n; i++){
            int v = Integer.parseInt(st.nextToken());
            set.add(v);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            int v = Integer.parseInt(st.nextToken());
            if(set.floor(v) != null){
                System.out.println(set.floor(v));
                set.remove(set.floor(v));
            }
            else{
                System.out.println(-1);
            }
        }
    }
}