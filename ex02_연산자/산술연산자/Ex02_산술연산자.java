package ex02_연산자.산술연산자;

import java.util.Scanner;

public class Ex02_산술연산자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        System.out.println("결과 : " + (num - num % 100));
        System.out.println("결과 : " + (num / 100 * 100));
    }
}
