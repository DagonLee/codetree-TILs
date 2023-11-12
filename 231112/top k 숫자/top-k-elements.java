import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, k;
        TreeSet<Integer> set = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int val = Integer.parseInt(st.nextToken());
            set.add(val);
        }
        for(int i = 0; i < k; i++){
            int last = set.last();
            System.out.print(last+" ");
            set.remove(last);
        }
    }
}