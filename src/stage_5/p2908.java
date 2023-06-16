package stage_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// StringBuilder reverse()함수를 이용한 문자열 뒤집기
// 이 방법이 아니라면 문자열의 길이를 구해서 for문을 통해 length()-1부터 0까지 줄여가며 문자하나하나 가져와야함
public class p2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int target = str.indexOf(" ");
        String str1 = str.substring(0,target);
        String str2 = str.substring(target+1);
        int A = Integer.parseInt(sb.append(str1).reverse().toString());
        sb.setLength(0); // StringBuilder 입력을 다시 받기위한 초기화
        int B = Integer.parseInt(sb.append(str2).reverse().toString());
        System.out.println(A > B ? A : B);
    }
}
