import java.io.*;
import java.util.*;

public class Main {
    static int m;
    public static int search(int target){
        int left = 1;
        int right = m;
        int cnt = 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(target == mid){
                break;
            }
            else if(target < mid){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int min = m;
        int max = 0;
        for(int i = a; i <= b; i++){
            int res = search(i);
            min = Math.min(res, min);
            max = Math.max(res, max);
        }
        System.out.println(min + " " + max);
    }
}