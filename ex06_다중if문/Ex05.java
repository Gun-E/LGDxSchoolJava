package ex06_다중if문;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연산을 입력하세요");
        String operate = sc.nextLine();

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = switch (operate) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> 0;
        };
        System.out.println(num1 + "과" + num2 + "의 합은 " + sum + "입니다.");
    }
}
