package programmers;

import java.util.Arrays;

public class Ex26 {
    public static void main(String[] args) {
        Ex26 ex26 = new Ex26();
        System.out.println(Arrays.toString(ex26.solution(3, new int[][]{{1, 2}, {2, 3}}, new int[]{2, 3}, 1)));
        System.out.println(Arrays.toString(ex26.solution(5, new int[][]{{1, 2}, {1, 4}, {2, 4}, {2, 5}, {4, 5}}, new int[]{1, 3, 5}, 5)));
    }

    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        int[] answer = {};
        return answer;
    }
}
