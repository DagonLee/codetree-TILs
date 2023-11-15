import java.io.*;
import java.util.*;

public class Main {
    static long m;
    public static long search(long target){
        long left = 1;
        long right = m;
        long cnt = 0;
        while(left <= right){
            cnt++;
            long mid = (left + right) / 2;
            if(target == mid){
                return cnt;
            }
            else if(target < mid){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long min = 1000000000;
        long max = 0;
        for(long i = a; i <= b; i++){
            long res = search(i);
            min = Math.min(res, min);
            max = Math.max(res, max);
        }
        System.out.println(min + " " + max);
    }
}