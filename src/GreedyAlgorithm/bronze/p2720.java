package GreedyAlgorithm.bronze;
//https://www.acmicpc.net/problem/2720

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class p2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int quarter = 0, dime = 0, nickel = 0, penny = 0;

        for (int i=0 ; i < T; i++){
            int C = Integer.parseInt(br.readLine());
            quarter = C / 25;
            C %= 25;
            dime = C / 10;
            C %= 10;
            nickel = C / 5;
            C %= 5;
            penny = C;
            sb.append(quarter + " ").append(dime + " ").append(nickel + " ").append(penny).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
