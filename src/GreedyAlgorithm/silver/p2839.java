package GreedyAlgorithm.silver;
//https://www.acmicpc.net/problem/2839 설탕 배달
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0; // 봉지 수

        // 가장 적은 수의 봉지를 가져가려면 무조건 5kg 먼저 체크해야함
        while (N != 0){
            if(N < 3){
                cnt = -1;
                break;
            } else {
                // 1. 5로 나뉘는게 가장 봉지수가 적음
                if(N % 5 == 0){
                    cnt += N/5;
                    N = 0;
                } else {
                    // 2. 5로 나뉘지 않는 경우 3을 빼고 다시 확인
                    N -= 3;
                    cnt++; // 봉지수 추가
                }
            }
        }
        System.out.println(cnt);
    }
}