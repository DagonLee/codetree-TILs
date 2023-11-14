import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static int lowerBound(int target){
        int left = 0;
        int right = n - 1;
        int idx = n;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] >= target){
                right = mid - 1;
                idx = Math.min(mid, idx);
            }
            else{
                left = mid + 1;
            }
        }
        if(arr[idx] != target){
            return -1;
        }
        return idx;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int v = Integer.parseInt(st.nextToken());
            arr[i] = v;
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            int target = Integer.parseInt(st.nextToken());
            int idx = lowerBound(target);
            if(idx == -1){
                System.out.println(-1);
            }
            else{
                System.out.println(idx + 1);
            }
        }
    }
}