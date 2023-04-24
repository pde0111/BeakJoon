package stage_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int[] playArr = new int[N]; // 공놀이하는 횟수 배열
        int M = Integer.parseInt(st.nextToken());

        for(int n=0; n < M ; n++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int t=i ; t <= j ; t++){
                playArr[t-1] = k;
            }
        }
        for (int num : playArr){
            sb.append(num).append(" ");
        }
        br.close();
        System.out.println(sb);
    }
}
