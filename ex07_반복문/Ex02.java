package ex07_반복문;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        //1. while
        while (n < 10) {
            n = sc.nextInt();
        }
        System.out.println("1 반복 끝");

        //2. do-while
        do {
            n = sc.nextInt();
        } while (n < 10);
        System.out.println("2 반복 끝");

        //3. while-true
        while(true) {
            n = sc.nextInt();
            if (n > 10) break;
        }
        System.out.println("3 반복 끝");
    }
}
