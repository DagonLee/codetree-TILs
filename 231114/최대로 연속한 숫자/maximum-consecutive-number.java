import java.io.*;
import java.util.*;

class Section implements Comparable<Section>{
    int len;
    int start;
    int end;
    public Section(int len, int start, int end){
        this.len = len;
        this.start = start;
        this.end = end;
    }
    public int compareTo(Section s){
        if(s.len != len){
            return len - s.len;
        }
        else if(s.start != start){
            return start - s.start;
        }
        else{
            return end - s.end;
        }
    }

}
public class Main {
    public static void main(String[] args) throws IOException{
        TreeSet<Section> sec_set = new TreeSet<>();
        TreeSet<Integer> del_set = new TreeSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int start = -1;
        int end = n + 1;
        del_set.add(start);
        del_set.add(end);
        sec_set.add(new Section(end - start - 1, start, end));
        for(int i = 0; i < m; i++){
            int v = Integer.parseInt(st.nextToken());
            int lower = del_set.lower(v);
            int higher = del_set.higher(v);
            sec_set.remove(new Section(higher - lower - 1, lower, higher));
            sec_set.add(new Section(higher - v - 1, v, higher));
            sec_set.add(new Section(v - lower - 1, lower, v));
            del_set.add(v);
            System.out.println(sec_set.last().len);
        }
    }
}