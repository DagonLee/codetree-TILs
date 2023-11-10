import java.io.*;
import java.util.*;

public class Main {
    static int n, g;
    static HashSet<Integer> set = new HashSet<>();
    static ArrayList<Integer>[] lst;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        lst = new ArrayList[g];
        set.add(1);
        for(int i = 0; i < g; i++){
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            lst[i] = new ArrayList<>();
            for(int j = 0; j < t; j++){
                lst[i].add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(lst[i]);
        }
        Arrays.sort(lst, new Comparator<ArrayList<Integer>>(){
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2){
                if(o1.size() < o2.size()){
                    return -1;
                }
                else if(o1.size() == o2.size()){
                    for(int i = 0; i < o1.size(); i++){
                        if(o1.get(i) < o2.get(i)){
                            return -1;
                        }
                        else if(o1.get(i) > o2.get(i)){
                            return 1;
                        }
                    }
                }
                return 0;
            }
            
        });
        for(int i = 0; i < g; i++){
            int cnt = 0;
            int toAdd = 0;
            if(lst[i].size() == 1){
                continue;
            }
            for(int j = 0; j < lst[i].size(); j++){
                int now =lst[i].get(j);
                if(!set.contains(now)){
                    cnt++;
                    toAdd = now;
                    if(cnt > 1){
                        break;
                    }
                }
            }
            if(cnt == 1){
                set.add(toAdd);
            }
        }
        System.out.print(set.size());
    }
}