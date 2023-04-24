package stage_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        String[] strArr = new String[num];
        strArr = br.readLine().split(" ");
        int target = Integer.parseInt(br.readLine());
        int cnt=0;

        for(int i=0; i < num ; i++){
            if(Integer.parseInt(strArr[i]) == target) cnt++;
        }
        sb.append(cnt);
        br.close();
        System.out.println(sb);
    }
}
