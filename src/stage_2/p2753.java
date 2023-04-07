package stage_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2753 {
    public static void main(String[] args) {
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        int answer = 0;
        if( year % 4 == 0 ){
            if ( year % 100 != 0 || year % 400 == 0){
                answer = 1;
            }
        }
        System.out.println(answer);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
