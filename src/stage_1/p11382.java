package stage_1;

import java.util.Scanner;
// 10의 12승은  1,000,000,000,000 로 int형의 범위를 벗어남
// int 형의 범위 2^32 = 2의 32제곱만큼의 크기 표현 가능
// 절반은 양수, 절반은 음수
// -2,147,483,647 ~ 2,147,483,647
public class p11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        long num = 0;
        for(String s : strArr){
            num += Long.parseLong(s);
        }
        System.out.println(num);
    }
}
