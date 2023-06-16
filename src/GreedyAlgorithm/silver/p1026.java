package GreedyAlgorithm.silver;

import java.io.*;
import java.util.*;

public class p1026 {
    public static void main(String[] args) throws IOException {
        // A의 가장 작은값과 B의 가장 큰값을 곱해야 합이 가장 작아짐.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1,st2;
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        Integer[] B = new Integer[N];
        int cnt = 0 ,sum = 0;

        st1 = new StringTokenizer(br.readLine());
        st2 = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N ; i++){
            A[i] = Integer.parseInt(st1.nextToken()); // 1 1 1 6 0
            B[i] = Integer.parseInt(st2.nextToken()); // 2 7 8 3 1
        }
        Arrays.sort(A); // A 배열 오름차순 정렬 0 1 1 1 6
        Arrays.sort(B, Collections.reverseOrder()); // B 내림차순 정렬 8 7 3 2 1

        for (int i = 0 ; i < N ; i++){
            sum += A[i] * B[i];
        }
        System.out.println(sum);
    }
}
