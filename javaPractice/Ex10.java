package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번 째 정수 입력 >>");
            list.add(sc.nextInt());
        }
        System.out.print("3의 배수 : ");
        list.stream().filter(i -> i % 3 == 0).forEach(i -> System.out.print(i + " "));
    }
}
