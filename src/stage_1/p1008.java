package stage_1;

import java.util.Scanner;
// 나누기는 소수점이 나올 수 있으므로 double 사용

public class p1008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        sc.close();
        System.out.println(a / b);
    }
}