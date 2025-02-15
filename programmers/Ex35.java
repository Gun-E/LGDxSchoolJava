package programmers;

import java.util.*;

public class Ex35 {
    public static void main(String[] args) {
        Ex35 ex35 = new Ex35();
        System.out.println(ex35.solution("baabaa"));
        System.out.println(ex35.solution("cdcd"));
    }

    //    public int solution(String s) {
//        String[] words = s.split("");
//        List<String> list = new ArrayList<>(Arrays.asList(words));
//
//        for (int i = 0; i < list.size(); i++) {
//            if ((i + 1) >= list.size()) {
//                break;
//            }
//            if (Objects.equals(list.get(i), list.get(i + 1))) {
//                list.remove(i);
//                list.remove(i);
//                i = -1;
//            }
//        }
//        if (list.isEmpty())
//            return 1;
//
//        return 0;
//    }
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
