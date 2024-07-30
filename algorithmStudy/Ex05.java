package algorithmStudy;

import java.util.*;

public class Ex05 {
    public static void main(String[] args) {
        long[] arr = triangleList(45);
        System.out.println(countingMoney(arr));
    }
    /**
        n을 기준으로 하는 파스칼 삼각형 배열을 생성하고
        마지막 배열을 리턴하는 매서드
     */
    private static long[] triangleList(int n) {
        long[][] triangle = new long[n + 1][];

        for (int i = 0; i <= n; i++) {
            triangle[i] = new long[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        return triangle[n];
    }
    /**
        배열을 가져와서 주어진 금액을 나눈 합계를 구하는 매서드
    */
    private static long countingMoney(long[] arr) {
        List<Integer> moneys = new ArrayList<>(List.of(1, 5, 10, 50, 100, 500, 1000, 2000, 5000, 10000));
        moneys.sort(Comparator.reverseOrder());
        long sum = 0;
        for (long a : arr) {
            for (int money : moneys) {
                sum += a / money;
                a %= money;
            }
        }
        return sum;
    }
}
