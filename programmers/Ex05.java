package programmers;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 3}));
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 2, 4}));
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 2, 2}));
    }
    public static int solution(int[] nums) {
        return Math.min(nums.length / 2, (int) Arrays.stream(nums).distinct().count());
    }
}
