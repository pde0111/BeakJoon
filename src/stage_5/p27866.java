package stage_5;

import java.io.*;

public class p27866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int target = Integer.parseInt(br.readLine())-1;
        System.out.println(str.charAt(target));
    }
}
