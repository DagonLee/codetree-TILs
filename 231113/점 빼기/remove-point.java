import java.io.*;
import java.util.*;

class Pair implements Comparable<Pair>{
    int x;
    int y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Pair p){
        if(p.x != x){
            return x - p.x;
        }
        else{
            return y - p.y;
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        TreeSet<Pair> set = new TreeSet<>();
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            set.add(new Pair(x, y));
        }
        for(int i = 0; i < m; i++){
            int v = Integer.parseInt(br.readLine());
            if(set.higher(new Pair(v, 0)) != null){
                Pair p = set.higher(new Pair(v, 0));
                System.out.println(p.x + " " + p.y);
                set.remove(p);
            }
            else{
                System.out.println("-1 -1");
            }
        }
    }
}