package ex04_단순if문;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int age = sc.nextInt();
            if (age >= 20) {
                System.out.println("성인입니다.");
                return;
            }
            System.out.println("성인이 아닙니다.");
        } catch (Exception e){
            System.err.println("에러발생");

        }
    }
}
