import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static int upperBound(int target){
        int start = 0;
        int end = n - 1;
        int idx = n;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] > target){
                end = mid - 1;
                idx = Math.min(idx, mid);
            }
            else{
                start = mid + 1;
            }
        }
        return idx;
    }
    static int lowerBound(int target){
        int start = 0;
        int end = n - 1;
        int idx = n;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] >= target){
                end = mid - 1;
                idx = Math.min(idx, mid);
            }
            else{
                start = mid + 1;
            }
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
            int val = Integer.parseInt(st.nextToken());
            arr[i] = val;
        }
        for(int i = 0; i < m; i++){
            int t = Integer.parseInt(br.readLine());
            System.out.println(upperBound(t) - lowerBound(t));
        }
    }
}