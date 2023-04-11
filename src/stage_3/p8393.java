package stage_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class p8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i=n ; i > 0 ; i--){
            sum += i;
        }
        System.out.println(sum);
    }
}
