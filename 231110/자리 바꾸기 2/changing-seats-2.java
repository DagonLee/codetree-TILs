import java.io.*;
import java.util.*;

public class Main {
    static int n, k;
    static HashSet<Integer>[] data;
    static int[] nums;
    static int[][] move;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        nums = new int[n];
        move = new int[k][2];
        data = new HashSet[n];
        for(int i = 0; i < n; i++){
            data[i] = new HashSet<>();
            data[i].add(i);
            nums[i] = i;
        }
        for(int i = 0; i < k; i++){
            st = new StringTokenizer(br.readLine());
            move[i][0] = Integer.parseInt(st.nextToken()) - 1;
            move[i][1] = Integer.parseInt(st.nextToken()) - 1;
        }
        for(int i = 0; i < 3 * k; i++){
            int now = i % k;

            //이동할 자리들
            int from = move[now][0];
            int to = move[now][1];

            // 현재 자리에 있는 사람의 번호
            int firstNum = nums[from];
            int secondNum = nums[to];

            // 자신의 이동 자리 저장
            data[firstNum].add(to);
            data[secondNum].add(from);

            // 자리 이동
            int tmp = firstNum;
            nums[from] = secondNum;
            nums[to] = tmp;

        }
        for(int i = 0; i < n; i++){
            System.out.println(data[i].size());
        }

    }
}