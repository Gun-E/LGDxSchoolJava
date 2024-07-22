package javajava;

import java.util.Arrays;

public class Ex18 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 8; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("가장 큰 값 : " + max);
        System.out.println("가장 작은 값 : " + min);
    }
}
