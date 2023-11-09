import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("add")){
                int key = Integer.parseInt(st.nextToken());
                int val = Integer.parseInt(st.nextToken());
                map.put(key, val);
            }
            else if(command.equals("remove")){
                int key = Integer.parseInt(st.nextToken());
                map.remove(key);
            }
            else if(command.equals("find")){
                int key = Integer.parseInt(st.nextToken());
                if(map.containsKey(key)){
                    System.out.println(map.get(key));
                }
                else{
                    System.out.println("None");
                }
            }
            else if(command.equals("print_list")){
                Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
                boolean printed = false;
                while(it.hasNext()){
                    Map.Entry<Integer, Integer> entry = it.next();
                    System.out.print(entry.getValue() + " ");
                    printed = true;
                }
                if(!printed){
                    System.out.print("None");
                }
                System.out.println();
                
            }
        }
    }
}