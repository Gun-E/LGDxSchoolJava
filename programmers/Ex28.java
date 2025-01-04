package programmers;

import java.util.Arrays;

public class Ex28 {
    public static void main(String[] args) {
        Ex28 ex28 = new Ex28();
        System.out.println(ex28.solution("1 2 3 4"));
        System.out.println(ex28.solution("-1 -2 -3 -4"));
        System.out.println(ex28.solution("-1 -1"));
    }

    public String solution(String s) {
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        return Arrays.stream(arr).min().orElse(0) + " " + Arrays.stream(arr).max().orElse(0);
    }
}
