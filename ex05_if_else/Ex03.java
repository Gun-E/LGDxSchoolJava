package ex05_if_else;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("개수 : ");
        int count = sc.nextInt();

        int total = count * 10000;

        if (count >= 11) total *= 0.9;

        System.out.println(total + "원");
    }
}
