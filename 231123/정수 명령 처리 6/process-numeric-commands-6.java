import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String com = st.nextToken();
            if(com.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                pq.add(-num);
            }
            else if(com.equals("size")){
                System.out.println(pq.size());
            }
            else if(com.equals("empty")){
                if(pq.isEmpty()){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
            else if(com.equals("pop")){
                System.out.println(-pq.poll());
            }
            else if(com.equals("top")){
                System.out.println(-pq.peek());
            }
        }
    }
}