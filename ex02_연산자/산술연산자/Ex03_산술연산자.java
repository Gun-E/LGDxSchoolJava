package ex02_연산자.산술연산자;

import java.util.Scanner;

public class Ex03_산술연산자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");

        int num = sc.nextInt();

        int result = (num - num % 10 + 1);

        System.out.println("결과 : " + result);
    }
}
