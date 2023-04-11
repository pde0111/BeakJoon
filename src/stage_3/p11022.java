package stage_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int a,b =0;

        for( int i=1; i <= t ; i++){
            String str = br.readLine();
            int target = str.indexOf(" ");
            a = Integer.parseInt(str.substring(0,target));
            b = Integer.parseInt(str.substring(target+1));
            int result = a + b;
            sb.append("Case #"+i+": ");
            sb.append(a+" + "+b+" = ");
            sb.append(result+"\n");
        }
        br.close();
        System.out.print(sb);
    }
}
