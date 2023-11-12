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
        if(this.x != p.x){
            return this.x - p.x;
        }
        else{
            return this.y - p.y;
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m;
        TreeSet<Pair> set = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            set.add(new Pair(x, y));
        }
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(set.ceiling(new Pair(x, y)) != null){
                Pair p = set.ceiling(new Pair(x, y));
                System.out.println(p.x + " " + p.y);
            }
            else{
                System.out.println("-1 -1");
            }
        }
    }

}