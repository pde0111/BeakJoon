package stage_3;

import java.io.*;


public class p15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for( int i=0; i < t ; i++){
            String str = br.readLine();
            int target = str.indexOf(" ");
            int result = Integer.parseInt(str.substring(0,target))
                    + Integer.parseInt(str.substring(target+1));
            sb.append(result+"\n");
        }
        br.close();
        System.out.print(sb);
    }
}
