package stage_4;

import java.io.*;

public class p1546 {
    public static void main(String[] args) throws IOException {
        int subject = readInt();
        int max = 0;
        int totalScore = 0;

        for(int i=0 ; i < subject ; i++){
            int score = readInt();
            max = Math.max(max,score);
            totalScore += score;
        }
        System.out.println(100.0d * totalScore / max /subject); // double형을 맨처음 곱해서 int -> double
    }

    static int readInt() throws IOException {
        int retValue = 0;
        boolean negative = false;
        while (true) {
            int i = System.in.read();
            if (i == '\r') continue;
            if (i == ' ' || i == '\n') {
                break;
            }
            else {
                if (i == '-') negative = true;
                else {
                    retValue = retValue * 10 + i - '0';
                }
            }
        }
        return negative ? -1 * retValue : retValue;
    }
}
