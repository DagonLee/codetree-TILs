import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        HashSet<Integer> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n ; i++){
            int val = Integer.parseInt(st.nextToken());
            set.add(val);
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int j = 0; j < m; j++){
            int val = Integer.parseInt(st.nextToken());
            if(set.contains(val)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}