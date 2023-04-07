package stage_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int nH = H;
        int nM = M-45;

        if( nM < 0 ){
            nH--;
            nM += 60;
            if( nH < 0 ){
                nH += 24;
            }
        }
        System.out.println(nH + " " + nM);
    }
}
