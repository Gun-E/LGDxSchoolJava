package programmers;

import java.util.Arrays;

public class Ex24 {
    public static void main(String[] args) {
        Ex24 ex24 = new Ex24();
        System.out.println(Arrays.toString(ex24.solution(2, 9)));
        System.out.println(Arrays.toString(ex24.solution(2, 1)));
        System.out.println(Arrays.toString(ex24.solution(2, 8)));
    }

    public int[] solution(int n, int s) {
        if (n > s) return new int[]{-1};
        int mok = s / n;
        int na = s % n;
        int[] answer = new int[n];
        Arrays.fill(answer, mok);

        for (int i = 0; i < na; i++) {
            answer[answer.length - 1 - i]++;
        }

        return answer;
    }
}
