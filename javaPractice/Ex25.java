package javaPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex25 {
    public static void main(String[] args) {
        String score = "A,A,B,C,D,A,C,D,D,D,F";
        String[] scores = score.split(",");
        Map<String, Long> countMap = Arrays
                .stream(scores)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        countMap.forEach((key, value) -> System.out.println(key + " : " + value + "명"));
    }
}