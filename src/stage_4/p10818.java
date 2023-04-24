package stage_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        String[] strArr = new String[num];
        Integer[] intArr = new Integer[num];
        strArr = br.readLine().split(" ");

        for(int i=0; i < num ; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int min = intArr[0];
        int max = intArr[0];
        for(int i=1; i < num ; i++){
            min = min < intArr[i] ? min : intArr[i];
            max = max > intArr[i] ? max : intArr[i];

        }
        br.close();
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}
