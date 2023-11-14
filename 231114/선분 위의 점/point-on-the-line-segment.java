import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static int upperBound(int target){
        int left = 0;
        int right = n - 1;
        int idx = n;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] > target){
                right = mid - 1;
                idx = Math.min(idx, mid);
            }else{
                left = mid + 1;
            }
        }
        return idx;
    }
    static int lowerBound(int target){
        int left = 0;
        int right = n - 1;
        int idx = n;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] >= target){
                right = mid - 1;
                idx = Math.min(idx, mid);
            }else{
                left = mid + 1;
            }
        }
        return idx;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(upperBound(b) - lowerBound(a));
        }
    }
}