import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m;
        TreeSet<Integer> set = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        set.add(-1);
        set.add(n + 1);
        ArrayList<Integer> lst = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            int val = Integer.parseInt(st.nextToken());
            lst.add(val);
            int max = 0;
            set.add(val);
            for(int j = 0; j < lst.size(); j++){
                int low = lst.get(j) - set.lower(lst.get(j)) - 1;
                int high = set.higher(lst.get(j)) - lst.get(j) - 1;
                max = Math.max(low, max);
                max = Math.max(high, max);
            }
            System.out.println(max);
        }

    }
}