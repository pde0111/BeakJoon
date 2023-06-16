package stage_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num ; i++){
            String repeat = br.readLine();
            int target = repeat.indexOf(" ");
            int reNum = Integer.parseInt(repeat.substring(0,target));
            String reStr = repeat.substring(target+1);
            for (int j=0; j<reStr.length() ; j++){
                String ch = reStr.charAt(j) + "";
                //sb.append(ch.repeat(reNum)); // repeat 함수는 java11부터 사용가능
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
