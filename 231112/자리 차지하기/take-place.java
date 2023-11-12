import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 1. TreeSet에 1 ~ m 번호를 넣어둔다.
        // 2. set.floor(ai) 로 나온 값 보다 작거나 같은 최초의 값을 TreeSet에서 제거
        //    단, set.floor(ai)로 나온 값이 null 이라면 종료
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Integer> set = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= m; i++){
            set.add(i);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(st.nextToken());
            if(set.floor(a) != null){
                set.remove(set.floor(a));
            }
            else{
                System.out.println(i);
                return;
            }
        }
        System.out.println(n);
    }
}