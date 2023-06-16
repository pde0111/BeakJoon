package GreedyAlgorithm.bronze;
//https://www.acmicpc.net/problem/4796
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = 0;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken()); // L일 동안 사용 5
            int P = Integer.parseInt(st.nextToken()); // 연속 일수 8
            int V = Integer.parseInt(st.nextToken()); // 휴가일수 17
            int sum = L + P + V;
            int result = 0;

            if (sum == 0) {
                break;
            } else {
                result = (V / P) * L + Math.min(L,(V % P));
                cnt++;
                System.out.println("Case " + cnt + ": " + result);
            }
        }
        br.close();
    }
}