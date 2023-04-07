package stage_2;

import java.util.*;
import java.io.*;

public class p2480_다른풀이 {
    static int[] countArr = new int[7];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens())
            countArr[Integer.parseInt(st.nextToken())]++;

        int result = 0;
        for(int i = 0; i < countArr.length; i++) {
            if(countArr[i] == 2) {
                result = 1000 + i*100;
                break;
            }
            if(countArr[i] == 3) {
                result = 10000 + i*1000;
                break;
            }

            if(countArr[i] == 1 && i > result)
                result = i;
        }

        if(result < 1100)
            result *= 100;

        System.out.print(result);
    }
}