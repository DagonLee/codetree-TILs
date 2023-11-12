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
        for(int i = 0; i < n ; i++){
            int val = Integer.parseInt(st.nextToken());
            set.add(val);
        }
        for(int i = 0; i < m; i++){
            int val = Integer.parseInt(br.readLine());
            if(set.ceiling(val) != null){
                System.out.println(set.ceiling(val));
            }
            else{
                System.out.println(-1);
            }
        }
    }
}