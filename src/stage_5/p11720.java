package stage_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// char-'0' => int
public class p11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;
        for(int i=0 ; i<num ; i++){
            sum += (str.charAt(i)-'0');
        }
        System.out.println(sum);
    }
}
