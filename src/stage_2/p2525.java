package stage_2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        int totalH = (M+time)/60;
        int totalM = (M+time)%60;

        H += totalH;
        M = totalM;
        if (H >= 24) {
            H = H%24;
        }
        sb.append(H).append(" ").append(M);
        System.out.println(sb);
    }
}
