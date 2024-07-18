package ex05_if_else;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if (grade >= 60) System.out.println("합격입니다.");
        else System.out.println("불합격입니다.");
    }
}
