package ex06_다중if문;

import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("user1 : ");
        String user1 = sc.nextLine();
        System.out.println("user2 : ");
        String user2 = sc.nextLine();
        System.out.println(user1+" >> ");
        String user1Hand = sc.nextLine();
        System.out.println(user2+" >> ");
        String user2Hand = sc.nextLine();
        Map<String, String> map = Map.of("가위", "보", "바위", "가위", "보", "바위");

        if (user1Hand.equals(user2Hand)) {
            System.out.println("무승부!");
        } else if (map.get(user1Hand).equals(user2Hand)) {
            System.out.println(user1+"승리!");
        } else if (map.get(user2Hand).equals(user1Hand)) {
            System.out.println(user2+"승리!");
        } else {
            System.out.println("잘못된 입력");
        }
    }
}
