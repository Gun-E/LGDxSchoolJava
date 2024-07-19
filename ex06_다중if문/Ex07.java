package ex06_다중if문;

import java.util.List;
import java.util.Scanner;

class Drink {
    Drink(String name, int price){
        this.name = name;
        this.price = price;
    }
    String name;
    int price;
}
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하세요 : ");
        int price = sc.nextInt();

        System.out.println("메뉴를 고르세요");
        System.out.println("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원)");

        List<Drink> drinks = List.of(
                new Drink("콜라", 800),
                new Drink("생수", 500),
                new Drink("비타민워터", 1500));

        System.out.println("숫자입력:");
        int choice = sc.nextInt();

        System.out.println(drinks.get(choice - 1).name + "를 선택하셨습니다!");

        if (drinks.get(choice - 1).price > price) {
            System.out.println("돈이 부족합니다.");
            return;
        }

        System.out.println("잔돈 : " + (price - drinks.get(choice - 1).price));
    }
}
