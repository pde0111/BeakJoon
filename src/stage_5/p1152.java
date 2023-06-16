package stage_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1152 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine().trim();
            if(str.equals("")){
                System.out.println(0);
            } else {
                String[] strArr = str.split(" ");
                System.out.println(strArr.length);
                /*System.out.println(str.chars().filter(c->c == ' ').count()+1);*/
            }
    }
}
