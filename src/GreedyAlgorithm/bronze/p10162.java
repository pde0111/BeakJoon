package GreedyAlgorithm.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] control = {300,60,10}; // 초단위로 배열 생성
        int result = -1;

        if (T%10 == 0) { // 입력받은 초가 가장 작은 단위인 10으로 나뉘지 않는 경우는 -1 출력
            for (int i = 0; i < control.length; i++) {
                result = T/control[i];
                T %= control[i];
                sb.append(result+" ");
            }
        } else {
            sb.append(result);
        }
        System.out.println(sb);
    }
}
