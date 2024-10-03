package algorithmStudy;

import java.util.Arrays;

public class DocumentOrder {

    public static void main(String[] args) {
        int n = 3;  // 문서의 개수
        int[] originalOrder = new int[n];
        for (int i = 0; i < n; i++) {
            originalOrder[i] = i;
        }

        long totalMoves = 0;
        long totalPermutations = factorial(n);

        // 모든 순열에 대해 계산
        for (long i = 0; i < totalPermutations; i++) {
            int[] currentOrder = getPermutation(originalOrder, i);
            totalMoves += calculateMoves(currentOrder, originalOrder);
        }

        System.out.println("모든 경우에 대한 이동 횟수의 합계: " + totalMoves);
    }

    public static int[] getPermutation(int[] originalOrder, long index) {
        int n = originalOrder.length;
        int[] result = originalOrder.clone();
        Arrays.sort(result);

        for (int i = 0; i < n; i++) {
            int factorial = (int) factorial(n - 1 - i);
            int pos = (int) (index / factorial);
            index %= factorial;
            int value = result[pos];
            System.arraycopy(result, pos + 1, result, pos, n - pos - 1);
            result[n - 1] = value;
        }

        return result;
    }

    public static int calculateMoves(int[] currentOrder, int[] originalOrder) {
        int n = currentOrder.length;
        int moves = 0;

        for (int i = 0; i < n; i++) {
            int idx = findIndex(currentOrder, originalOrder[i]);
            if (idx != i) {
                int temp = currentOrder[idx];
                System.arraycopy(currentOrder, i, currentOrder, i + 1, idx - i);
                currentOrder[i] = temp;
                moves++;
            }
        }

        return moves;
    }

    public static int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

