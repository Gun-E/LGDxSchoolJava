package ex06_다중if문;

import java.util.Map;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하세요");
        int price = sc.nextInt();

        System.out.println("메뉴를 고르세요");
        System.out.println("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원)");
        Map<Integer, String> map = Map.of(1, "콜라", 2, "생수", 3, "바위");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("콜라를 선택하셨습니다!");
                break;
            case 2:
                System.out.println("생수를 선택하셨습니다!");
                break;
            case 3:
                System.out.println("비타민워터를 선택하셨습니다!");
                break;

        }
    }
}
