import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int val = Integer.parseInt(st.nextToken());
            if(command.equals("find")){
                if(set.contains(val)){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }else if(command.equals("add")){
                set.add(val);
            }else if(command.equals("remove")){
                set.remove(val);
            }
        }
    }
}