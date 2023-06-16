package stage_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// a~z 아스키코드 97~122
public class p10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int[] intArr = new int[26];
        Arrays.fill(intArr,-1); // 배열 초기화
        for(int i=0 ; i<str.length() ; i++){
            int idx = (int)str.charAt(i)-97; // 알파벳 -> 아스키코드 -97 -> 배열의 인덱스
            if(intArr[idx] == -1){ intArr[idx] = i; } // 중복 방지
        }
        for(int n : intArr){
            sb.append(n+" ");
        }
        System.out.println(sb);
    }
}
