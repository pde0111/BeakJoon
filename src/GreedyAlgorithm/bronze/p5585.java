package GreedyAlgorithm.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());
        int result = 1000 - value; // 잔액 구하기
        int cnt = 0;

        int[] charge = {500,100,50,10,5,1};
        for(int i=0; i < 6; i++){
            while(result-charge[i] >= 0){
                result -= charge[i];
                cnt++;
            }
        }

        /*while (result != 0){
            if (result > 500){
                result -= 500; // 499
                cnt ++; // 1
            }
            if (result > 100) {
                cnt += result / 100 ; // 1 + 4
                result = result % 100 ; // 99
            }
            if(result > 50){
                cnt += result / 50 ; // 5 + 1
                result = result % 50 ; // 49
            }
            if(result > 10){
                cnt += result / 10 ; // 6 + 4
                result = result % 10 ; // 9
            }
            if(result >= 5){
                cnt += result / 5 ; // 10 + 1
                result = result % 5 ; // 4
            }
            if(result >= 1){
                cnt += result; // 11 + 4
            }
            result = 0;
        }*/
        System.out.println(cnt);
    }
}