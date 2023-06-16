package stage_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A~Z 아스키코드 65~91
// a~z 아스키코드 97~122
// 문자 -> 숫자 (int)char
// 숫자 -> 문자 (char)int
public class p11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch = br.read(); // 알아서 아스키코드로 저장됨.
        System.out.println(ch);
        /*
        char ch = br.readLine().charAt(0);
        System.out.println((int)ch);
        */
    }
}
