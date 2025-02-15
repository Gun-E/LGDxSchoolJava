package programmers;

import java.util.Arrays;

public class Ex36 {
    public static void main(String[] args) {
        Ex36 ex36 = new Ex36();
        System.out.println(Arrays.toString(ex36.solution(10, 2)));
        System.out.println(Arrays.toString(ex36.solution(8, 2)));
    }
    public int[] solution(int brown, int yellow) {
        int S = (brown+4)/2;
        int P = brown+yellow;

        int w = (int) ((S + Math.sqrt(S * S - 4 * P)) / 2);
        int h = S - w;

        return new int[]{w, h};
    }
}
