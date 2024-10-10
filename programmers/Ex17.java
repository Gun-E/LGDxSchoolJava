package programmers;

import java.util.Stack;

public class Ex17 {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = prices.length - 1 - idx;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] prices1 = {1, 2, 3, 2, 3};
        int[] result1 = solution(prices1);
        for (int r : result1) {
            System.out.print(r + " ");
        }
        System.out.println();

        int[] prices2 = {4, 5, 2, 6, 3};
        int[] result2 = solution(prices2);
        for (int r : result2) {
            System.out.print(r + " ");
        }
    }
}
