package javaPractice;

import java.util.Arrays;

public class Ex17 {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        Arrays.stream(arr).forEach(a -> Arrays.fill(a, 0));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");

            }
            for (int j = 0; j < 3-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < 3-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 3-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}