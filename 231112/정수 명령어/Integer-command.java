import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            TreeSet<Integer> set = new TreeSet<>();
            for(int j = 0; j < n; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                char c = st.nextToken().charAt(0);
                int val = Integer.parseInt(st.nextToken());
                if(c == 'I'){
                    set.add(val);
                }else if(c == 'D'){
                    if(!set.isEmpty()){
                        if(val == 1){
                            set.remove(set.last());
                        }
                        else if(val == -1){
                            set.remove(set.first());
                        }
                    }
                }
            }
            if(set.isEmpty()){
                System.out.println("EMPTY");
            }
            else{
                System.out.println(set.last() + " " + set.first());
            }
        }
    }
}