package programmers;

import java.util.Stack;

public class Ex14 {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
    }
    static boolean solution(String s) {
        int count=0;

        for (char c : s.toCharArray()) {
            if (c=='(') count++;
            else if (c==')') count--;
            if (count < 0) return false;
        }
        return (count == 0);
    }
//    static boolean solution(String s) {
//        Stack<Character> stack = new Stack<>();
//
//        for (char c : s.toCharArray()) {
//            if (c == '(') {
//                stack.push(c);
//            } else if (c == ')') {
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                stack.pop();
//            }
//        }
//
//        return stack.isEmpty();
//    }
}
