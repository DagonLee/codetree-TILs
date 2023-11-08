import java.io.*;
import java.util.*;
public class Main {
    static int n, m;
    static StringTokenizer st;
    static HashMap<String, String> map = new HashMap<>();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= n; i++){
            String input = br.readLine();
            map.put(input, i+"");
            map.put(i+"", input);
        }
        for(int i = 0; i < m; i++){
            String input = br.readLine();
            System.out.println(map.get(input));
        }
    }
}