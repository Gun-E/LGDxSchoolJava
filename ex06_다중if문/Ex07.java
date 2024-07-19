package ex06_다중if문;

import java.util.List;
import java.util.Scanner;

class Drink {
    Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String name;
    int price;
}

class Money {
    Money(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String name;
    int price;
}

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Drink> drinks = List.of(
                new Drink("콜라", 800),
                new Drink("생수", 500),
                new Drink("비타민워터", 1500));
        List<Money> moneys = List.of(
                new Money("천원", 1000),
                new Money("오백원", 500),
                new Money("백원", 100));

        System.out.print("금액을 입력하세요 : ");
        int price = sc.nextInt();

        System.out.println("메뉴를 고르세요");
        System.out.println("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원)");


        System.out.println("숫자입력:");
        int choice = sc.nextInt();

        System.out.println(drinks.get(choice - 1).name + "를 선택하셨습니다!");

        if (drinks.get(choice - 1).price > price) {
            System.out.println("돈이 부족합니다.");
            return;
        }

        int charge = price - drinks.get(choice - 1).price;
        System.out.println("잔돈 : " + charge);


        for (Money money : moneys) {
            int count = 0;

            while (charge >= money.price) {
                count++;
                charge -= money.price;
            }

            if (count != 0)
                System.out.println(money.name + " : " + count);
        }
        System.out.println("맛있게 드세요^^");
    }
}
