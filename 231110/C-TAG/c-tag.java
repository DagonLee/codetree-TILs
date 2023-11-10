import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static char[][] groupA;
    static char[][] groupB;
    static HashSet<String> setA = new HashSet<>();
    static HashSet<String> setB = new HashSet<>();
    static int ans = 0;
    static ArrayList<Integer> selectedLines = new ArrayList<>();
    static void select(int cur){
        if(selectedLines.size() == 3){
            // System.out.println(selectedLines.toString());
            boolean dupCheck = false;
            for(int r = 0; r < n; r++){
                String tmpA = "";
                String tmpB = "";
                for(int i = 0; i < 3; i++){
                    int curLine = selectedLines.get(i);
                    tmpA += groupA[r][curLine];
                    tmpB += groupB[r][curLine];
                }
                if(setA.contains(tmpB) || setB.contains(tmpA) || tmpA.equals(tmpB)){
                    setA.clear();
                    setB.clear();
                    dupCheck = true;
                    break;
                }
                else{
                    setA.add(tmpA);
                    setB.add(tmpB);
                }
            }
            if(!dupCheck){
                ans++;
            }
            return;            
        }
        for(int i = cur; i < m; i++){
            selectedLines.add(i);
            select(i + 1);
            selectedLines.remove(selectedLines.size() - 1);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        groupA = new char[n][m];
        groupB = new char[n][m];

        for(int i = 0; i < n; i++){
            String line = br.readLine();
            for(int j = 0; j < m; j++){
                groupA[i][j] = line.charAt(j);
            }
        }
        for(int i = 0; i < n; i++){
            String line = br.readLine();
            for(int j = 0; j < m; j++){
                groupB[i][j] = line.charAt(j);
            }
        }
        select(0);
        System.out.println(ans);
    }
}