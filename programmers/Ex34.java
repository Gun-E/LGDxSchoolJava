package programmers;

import java.util.HashMap;
import java.util.Map;

public class Ex34 {
    public static void main(String[] args) {
        Ex34 ex34 = new Ex34();
        System.out.println(ex34.solution(2));
//        System.out.println(ex34.solution(3));
    }

    //    public int solution(int n) {
//        return (n <= 1) ? n : solution(n-1)+solution(n-2);
//    }
    public int solution(int n) {
        int mod = 1234567;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = (a + b) % mod;
            a = b;
            b = temp;
        }
        return b;
    }
//    public int solution(int n) {
//        int mod = 1234567;
//        int[] dp = new int[n + 1];
//
//        dp[0] = 0;
//        dp[1] = 1;
//
//        for (int i = 2; i <= n; i++) {
//            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
//        }
//
//        return dp[n];
//    }
}
