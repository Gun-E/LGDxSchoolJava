package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex19 {
    public static void main(String[] args) {
        Ex19 ex19 = new Ex19();
        System.out.println(ex19.solution("try hello world"));
    }

    public String solution(String s) {
        String[] split = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < split[i].length(); j++) {
                char c = split[i].charAt(j);
                if (j % 2 == 0) {
                    word.append(Character.toUpperCase(c));
                } else {
                    word.append(Character.toLowerCase(c));
                }
            }
            result.append(word);

            if (i < split.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
    public String solution2(String s) {
        StringBuilder result = new StringBuilder();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                result.append(c);
                index = 0;
            } else {
                if (index % 2 == 0) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                index++;
            }
        }

        return result.toString();
    }

}
