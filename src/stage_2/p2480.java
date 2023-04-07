package stage_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        Integer[] intList = {num1,num2,num3};
        int prize,max = 0;

        if (num1 == num2 && num1 == num3){
            prize = 10000+(num1*1000);
        } else if (num1 == num2){
            prize = 1000+(num1*100);
        } else if (num2 == num3){
            prize = 1000+(num2*100);
        } else if (num3 == num1){
            prize = 1000+(num3*100);
        } else {
            for (int i : intList) {
                max = max < i ? i : max;
            }
            prize = max * 100;
        }
        System.out.println(prize);
    }
}
