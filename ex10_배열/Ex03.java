package ex10_배열;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex03 {
    public static void main(String[] args) {
        int arrSize = 5;

        int[][] array = new int[arrSize][arrSize];

        int c = 1;

        System.out.println("1번");
        for (int[] i : array) {
            for (int j : i) {
                j=c++;
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        c = 21;
        System.out.println("2번");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=c++;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("3번");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i] + "\t");
            }
            System.out.println();
        }
        System.out.println("4번");
        for (int[] ints : array) {
            for (int j = array.length - 1; j >= 0; j--) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
        System.out.println("5번");
        c = 1;
        int [][] array5 = new int[5][5];
        System.out.println(array5.length);
        for (int i = 0; i < array5.length; i++) {
            int start = Math.abs((array5.length / 2) - i);
            int end = array5.length - start;

            for (int j = start; j < end; j++) {
                array5[j][i] = c++;
            }
        }

        for (int[] arr : array5) {
            for (int i : arr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
