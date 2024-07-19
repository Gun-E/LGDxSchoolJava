package ex06_다중if문;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연산을 입력하세요");
        String operate = sc.nextLine();

        System.out.println("A의 값을 입력하세요");
        int num1 = sc.nextInt();
        System.out.println("B의 값을 입력하세요");
        int num2 = sc.nextInt();

        int cal = 0;
        String str = "";
        if (operate.equals("+")) {
            str = "합은";
            cal = num1 + num2;
        } else if (operate.equals("-")) {
            str = "차는";
            cal = num1 - num2;
        } else if (operate.equals("*")) {
            str = "곱은";
            cal = num1 * num2;
        } else if (operate.equals("/")) {
            str = "몫은";
            cal = num1 / num2;
        }

        System.out.println(num1 + "과" + num2 + "의 " + str + " " + cal + "입니다.");
    }
}
