import java.io.*;
import java.util.*;

class Problem implements Comparable<Problem>{
    int num;//문제번호
    int dif;//난이도
    public Problem(int num, int dif){
        this.num = num;
        this.dif = dif;
    }
    public int compareTo(Problem p){
        if(p.dif != dif){
            return dif - p.dif; // 내림차순 정렬
        }
        else{
            return num - p.num; // 내림차순 정렬
        }
    }
}
public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Problem> set = new TreeSet<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            set.add(new Problem(x, y));
        }
        int m = Integer.parseInt(br.readLine());
        for(int j = 0; j < m; j++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("ad") || command.equals("sv")){
                int num = Integer.parseInt(st.nextToken());
                int dif = Integer.parseInt(st.nextToken());
                if(command.equals("ad")){
                    set.add(new Problem(num, dif));
                }
                else if(command.equals("sv")){
                    set.remove(new Problem(num, dif));
                }
            }
            else{
                int val = Integer.parseInt(st.nextToken());
                if(val == 1){
                    Problem p = set.last();
                    System.out.println(p.num);
                }
                else if(val == -1){
                    Problem p = set.first();
                    System.out.println(p.num);
                }
            }
        }
    }
}