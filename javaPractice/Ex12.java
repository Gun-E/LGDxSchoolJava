package javaPractice;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단수입력 : ");
        int n = sc.nextInt();
        System.out.println("어느 수까지 출력 : ");
        int max = sc.nextInt();

        System.out.println(n + "단");
        for (int i = 1; i <= max; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}
