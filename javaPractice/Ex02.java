package javaPractice;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("일한시간을 입력하세요 : ");
        int work = sc.nextInt();
        int pay = 5000 * work;
        if (work > 8) pay *= 1.5;
        System.out.println("총 임금은 " + pay + "원 입니다.");
    }
}
