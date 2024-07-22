package javaPractice;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("행 개수 : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j-i > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
