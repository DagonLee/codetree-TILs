import java.io.*;
import java.util.*;

class Person implements Comparable<Person>{
    int start;
    int speed;
    int last_pos;
    public Person(int start, int speed, int last_pos){
        this.start = start;
        this.speed = speed;
        this.last_pos = last_pos;
    }
    public int compareTo(Person p){
        if(last_pos != p.last_pos){
            return last_pos - p.last_pos;
        }
        else if(start != p.start){
            return p.start - start;
        }
        else{
            return p.speed - speed;
        }

    }
}
public class Main {
    public static void main(String[] args) throws IOException{
        // 1. 제한 시간 T 안에 추월되면 추월 된 사람의 속도와 시작 점, 이동 시간 수정 갱신 필요
        // 2. 
        // 3. 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        ArrayList<Person> lst = new ArrayList<>();
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            lst.add(new Person(s, v, s + t * v));
        }
        TreeSet<Person> set = new TreeSet<>();
        for(int i = 0; i < lst.size();  i++){
            Person p = lst.get(i);
            if(set.higher(p) != null){
                continue;
            }
            set.add(p);
        }
        System.out.println(set.size());
    }
}