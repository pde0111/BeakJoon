package stage_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num ;i++){
            String str = br.readLine();
            sb.append(str.charAt(0)).append(str.charAt(str.length()-1)).append("\n");
        }
        System.out.println(sb);
    }
}
