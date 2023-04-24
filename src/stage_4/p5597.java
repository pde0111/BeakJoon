package stage_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] student = new int[30];
        for (int i=0; i < 28 ; i++){
            int num = Integer.parseInt(br.readLine())-1;
            student[num] = 1;
        }
        for (int i=0; i < 30 ; i++){
            if(student[i] == 0){
                sb.append((i+1)+"\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
