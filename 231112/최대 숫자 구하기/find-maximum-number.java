import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        TreeSet<Integer> set = new TreeSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= m; i++){
            set.add(i);
        }
        for(int i = 0; i < n; i++){
            int val = Integer.parseInt(st.nextToken());
            set.remove(val);
            System.out.println(set.last());

        }
    }
}