package ex08_for문;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        for (int i = 2; i <= 30; i++) {
            System.out.print(i + "의 약수 : ");
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
