package baekjoon;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ex1406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        LinkedList<String> list = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            list.add(String.valueOf(ch));
        }

        int num = Integer.parseInt(sc.nextLine());

        ListIterator<String> iterator = list.listIterator(list.size());

        for (int i = 0; i < num; i++) {
            String s = sc.nextLine();

            if (s.length() > 2) {
                String[] input = s.split(" ");
                iterator.add(input[1]);
            } else {
                switch (s) {
                    case "L":
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        break;
                    case "D":
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        break;
                    case "B":
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                            iterator.remove();
                        }
                        break;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (String ch : list) {
            result.append(ch);
        }
        System.out.println(result);
    }
}
