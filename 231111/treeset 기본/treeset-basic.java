import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Integer> set = new TreeSet<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("add")){
                int val = Integer.parseInt(st.nextToken());
                set.add(val);
            }
            else if(command.equals("remove")){
                int val = Integer.parseInt(st.nextToken());
                set.remove(val);
            }
            else if(command.equals("find")){
                int val = Integer.parseInt(st.nextToken());
                if(set.contains(val)){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }
            else if(command.equals("lower_bound")){
                int val = Integer.parseInt(st.nextToken());
                
                if(set.isEmpty()){
                    System.out.println("None");
                }
                else{
                    Integer ceil = set.ceiling(val);
                    if(ceil != null){
                        System.out.println(ceil);
                    }
                    else{
                        System.out.println("None");
                    }
                }
            }
            else if(command.equals("upper_bound")){
                int val = Integer.parseInt(st.nextToken());
                if(set.isEmpty()){
                    System.out.println("None");
                }
                else{
                    Integer higher = set.higher(val);
                    if(higher != null){
                        System.out.println(higher);
                    }
                    else{
                        System.out.println("None");
                    }
                }
            }
            else if(command.equals("largest")){
                if(set.isEmpty()){
                    System.out.println("None");
                }
                else{
                    System.out.println(set.last());
                }
            }
            else if(command.equals("smallest")){
                if(set.isEmpty()){
                    System.out.println("None");
                }
                else{
                    System.out.println(set.first());
                }
            }
        }
    }
}