package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));
    }

    public static int solution(int[] citations) {
        Arrays.sort(citations);

        return IntStream.range(0, citations.length)
                .map(i -> citations.length - i)
                .filter(h -> h <= citations[citations.length - h])
                .findFirst()
                .orElse(0);
    }
}
