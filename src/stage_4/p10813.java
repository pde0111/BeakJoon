package stage_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for (int i=0; i < N ; i++){
            basket[i] = i+1;
        }
        for (int k=0; k < M ; k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }
        for(int n : basket){
            sb.append(n+" ");
        }
        br.close();
        System.out.println(sb);
    }
}
