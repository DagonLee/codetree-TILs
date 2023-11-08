import java.io.*;
import java.util.*;

class Num implements Comparable<Num>{
    int val;
    int freq;
    Num(int val, int freq){
        this.val = val;
        this.freq = freq;
    }
    public int compareTo(Num n){
        if(n.freq != this.freq){
            return n.freq - this.freq;
        }
        return n.val - this.val;
    }
}
public class Main {
    static int n, k;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int val = Integer.parseInt(st.nextToken());
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        ArrayList<Num> lst = new ArrayList<>();
        Set<Integer>keySet = map.keySet();
        for(int key:keySet){
            lst.add(new Num(key,map.get(key)));
        }
        Collections.sort(lst);
        for(int i = 0; i < k; i++){
            System.out.print(lst.get(i).val + " ");
        }
    }
}