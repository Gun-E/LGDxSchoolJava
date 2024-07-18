package ex06_다중if문;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 입력 : ");
        int score = sc.nextInt();
        char result;
        if (score >= 90) result = 'A';
        else if (score >= 80) result = 'B';
        else if (score >= 70) result = 'C';
        else result = 'D';
        System.out.println(result + " 학점입니다.");
    }
}
