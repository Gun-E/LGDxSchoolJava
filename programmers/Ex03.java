package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 10, 2}));
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
    }


    public static String solution(int[] numbers) {
        String[] numStrings = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(numStrings, (a, b) -> (b + a).compareTo(a + b));

        if (numStrings[0].equals("0")) {
            return "0";
        }
        return String.join("", numStrings);
    }
}
