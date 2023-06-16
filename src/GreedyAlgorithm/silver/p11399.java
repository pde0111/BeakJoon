package GreedyAlgorithm.silver;
//https://www.acmicpc.net/problem/11399

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class p11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int N = Integer.parseInt(br.readLine()); // 사람 수
        st = new StringTokenizer(br.readLine()); // 소요 시간
        int[] time = new int[N];
        for (int i=0; i < N; i++){
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time); // 오름차순 정렬
        int sum = 0, result = 0;
        for(int num : time){
            sum +=  num;
            result += sum;
        }
        System.out.println(result);
    }
}
