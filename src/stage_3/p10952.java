package stage_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a,b =0;

        while (true){
            String str = br.readLine();
            int target = str.indexOf(" ");
            a = Integer.parseInt(str.substring(0,target));
            b = Integer.parseInt(str.substring(target+1));
            if(a==0 && b==0){
                break;
            }
            sb.append(a+b).append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}
