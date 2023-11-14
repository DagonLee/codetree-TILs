import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int v = Integer.parseInt(st.nextToken());
            lst.add(v);
        }
        for(int i = 0; i < m; i++){
            int val = Integer.parseInt(br.readLine());
            int start = 0;
            int end = n - 1;
            int idx = -1;
            while(start <= end){
                int mid = (start + end) / 2;
                if(val == lst.get(mid)){
                    idx = mid;
                    break;
                }
                else if(val < lst.get(mid)){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            if(idx != -1){
                System.out.println(idx + 1);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}