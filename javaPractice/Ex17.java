package javaPractice;

import java.util.Arrays;

public class Ex17 {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        int c = 1;
        Arrays.stream(arr).forEach(a -> Arrays.fill(a, 0));

        for (int i = 0; i < arr.length; i++) {
            int start = Math.abs((arr.length / 2) - i);
            int end = arr.length - start;

            for (int j = start; j < end; j++) {
                arr[j][i] = c++;
            }
        }

        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}