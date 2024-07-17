package ex02_연산자.산술연산자;

import java.util.Scanner;

public class Ex05_산술연산자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("초 입력 : ");
        int num = sc.nextInt();

        int hour = num / 3600;
        int min = num % 3600 / 60;
        int secs = num % 60;

        System.out.println(hour + "시간 " + min + "분 " + secs + "초");

    }
}
