package stage_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int target = str.indexOf(" ");
        int num = Integer.parseInt(str.substring(0,target));
        int x = Integer.parseInt(str.substring(target+1));
        int n = 0;
        String[] strArr = new String[num];
        strArr = br.readLine().split(" ");

        for(int i=0; i < num ; i++){
            n = Integer.parseInt(strArr[i]);
            if(n < x){
                sb.append(n).append(" ");
            }
        }
        br.close();
        System.out.println(sb);
    }
}
