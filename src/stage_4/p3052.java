package stage_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] result = new int[10];
        int cnt = 0;
        for (int i=0; i < 10 ; i++){
            st = new StringTokenizer(br.readLine());
            result[i] = Integer.parseInt(st.nextToken()) % 42;
        }
        for(int i=0; i < 10 ; i++){
            for(int j=i+1; j < 10 ; j++) {
                if (result[i] == result[j]) {
                    result[j] = -1; // 증복제거
                }
            }
        }
        for(int n : result){
            if(n != -1){
                cnt++;
            }
        }
        br.close();
        System.out.println(cnt);
    }
}
