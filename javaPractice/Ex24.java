package javaPractice;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex24 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        IntStream.range(0, arr.length)
                .forEach(
                        i -> arr[i] = (int) (Math.random() * 100)
                );

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("가장 큰 값 : " + max);
        System.out.println("가장 작은 값 : " + min);
    }
}