package stage_4;

import java.io.*;

public class p10811 {
    public static void main(String[] args) throws IOException {
        int num = readInt();
        int play = readInt();
        int[] basket = new int[num];
        for(int i=0; i<num ; i++){
            basket[i] = i+1;
        }
        for(int i=0; i<play ; i++){
            int start = readInt()-1;
            int end = readInt()-1;
            for (int j=end ; j >= start ; j--){
                int temp = basket[j];
                basket[j] = basket[start];
                basket[start] = temp;
                start++;
            }
        }
        for(int n : basket){
            System.out.println(n);
        }
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