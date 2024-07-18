package ex05_if_else;

import java.util.Scanner;

public class Ex02 {
    //입장료 계산
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.print("인원수 : ");
        int count = sc.nextInt();

        int total = count * 5000;

        if (age <= 20) total /= 2;

        System.out.println("총 " + total + "원");
    }
}
