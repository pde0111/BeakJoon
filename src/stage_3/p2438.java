package stage_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int cnt = t-1;
        for( int i=1; i <= t ; i++){
            for(int j=cnt; j > 0 ; j--){
                sb.append(" ");
            }
            for(int k=0; k < i ; k++){
                sb.append("*");
            }
            cnt--;
            sb.append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}
