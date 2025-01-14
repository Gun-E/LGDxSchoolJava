package programmers;

import java.util.*;

public class Ex31 {
    public static void main(String[] args) {
        Ex31 ex31 = new Ex31();
//        System.out.println(Arrays.toString(ex31.solution("0111010")));
        System.out.println(Arrays.toString(ex31.solution("110010101001")));
        System.out.println(Arrays.toString(ex31.solution("01110")));
        System.out.println(Arrays.toString(ex31.solution("1111111")));
    }

    public int[] solution(String s) {
        int repeat = 0;
        int count = 0;


        while (s.length() > 1) {
            int zeroCount = s.length() ;

            s = s.replaceAll("0", "");
            count += zeroCount - s.length();

            s = Integer.toBinaryString(s.length());

            repeat++;
        }

        return new int[]{repeat, count};
    }
}
