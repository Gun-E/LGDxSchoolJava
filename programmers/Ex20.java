package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Ex20 {
    public static void main(String[] args) {
        Ex20 ex = new Ex20();
        System.out.println(Arrays.toString(ex.solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"})));
        System.out.println(Arrays.toString(ex.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"})));
    }
    public int[] solution(String[] operations) {
        Queue<Integer> queue = new LinkedList<>();
        for (String operation : operations) {
            if (operation.equals("D 1")) {
                int max = queue.stream().max(Integer::compareTo).orElse(0);
                queue.remove(max);
            }
            else if (operation.equals("D -1")) {
                int min = queue.stream().min(Integer::compareTo).orElse(0);
                queue.remove(min);
            }
            if (operation.split("")[0].equals("I")) {
                queue.add(Integer.parseInt(operation.split(" ")[1]));
            }

        }
        int [] answer= new int[2];
        answer[0] = queue.stream().max(Integer::compareTo).orElse(0);
        answer[1] = queue.stream().min(Integer::compareTo).orElse(0);
        return answer;
    }
}
