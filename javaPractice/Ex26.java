package javaPractice;

import java.util.stream.IntStream;

public class Ex26 {
    public static void main(String[] args) {
        String[] names = {"Queen", "Tod", "Kim"};
        System.out.println(findKim(names));

    }

    private static String findKim(String[] names) {
        int index = IntStream.range(0, names.length)
                .filter(i -> names[i].equals("Kim"))
                .findFirst()
                .orElse(0) + 1;
        return "김서방은 " + index + "에 있다.";
    }
}