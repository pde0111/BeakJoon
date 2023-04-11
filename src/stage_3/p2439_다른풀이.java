package stage_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2439_다른풀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        char[] stars = new char[t];

        for( int i=0; i < t ; i++){
            stars[i] = ' ';
        }
        for( int i=0; i < t ; i++){
            stars[t-i-1] = '*';
            sb.append(stars).append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}
