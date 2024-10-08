package programmers;

import java.util.*;

public class Ex15 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }

    public static int solution(int[] priorities, int location) {
        HashMap<Character, Integer> map = new HashMap<>();

        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            map.put((char) (65 + i), priorities[i]);
            queue.add((char) (65 + i));
        }
        List<Character> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            char max = queue.stream()
                    .max(Comparator.comparing(map::get)).orElse(null);
            if (queue.isEmpty()) break;
            char q = queue.poll();
            if (q != max) {
                queue.add(q);
            } else {
                list.add(q);
            }
        }
        return list.indexOf((char) (location + 65)) + 1;
    }
}
