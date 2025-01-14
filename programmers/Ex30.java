package programmers;

import java.util.Arrays;

public class Ex30 {
    public static void main(String[] args) {
        Ex30 ex30 = new Ex30();
        System.out.println(ex30.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
        System.out.println(ex30.solution(new int[]{1, 2}, new int[]{3, 4}));
    }

    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B[B.length - 1 - i];
        }

        return sum;
    }
}
