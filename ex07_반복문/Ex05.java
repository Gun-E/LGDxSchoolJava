package ex07_반복문;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("현재 몸무게 : ");
        int current_weight = sc.nextInt();

        System.out.print("목표 몸무게 : ");
        int hope_weight = sc.nextInt();

        int week = 1;

        while (current_weight > hope_weight) {
            System.out.print(week++ + "주차 감량 몸무게: ");
            int minus_weight = sc.nextInt();
            current_weight -= minus_weight;
        }

        System.out.println(current_weight + "kg 달성!! 축하합니다!");
    }
}
