package ex03_삼항연산자;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("정수2 입력 : ");
        int num2 = sc.nextInt();

        int result = num1>num2 ? num1-num2 : num2-num1;

        System.out.print("결과 : ");
        System.out.println(result);
    }
}
