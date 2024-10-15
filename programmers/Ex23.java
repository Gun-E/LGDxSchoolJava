package programmers;

import java.util.*;

public class Ex23 {
    public static void main(String[] args) {
        Ex23 ex23 = new Ex23();
        System.out.println(ex23.solution(4, new int[]{4, 3, 3}));
        System.out.println(ex23.solution(1, new int[]{2, 1, 2}));
        System.out.println(ex23.solution(3, new int[]{1, 1}));
        System.out.println(ex23.solution(10, new int[]{10, 10, 1})); //10, [10, 10, 1], 51
        System.out.println(ex23.solution(999, new int[]{800, 100, 55, 45})); //999, [800, 100, 55, 45], 1
    }

    public long solution(int n, int[] works) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int work : works) maxHeap.add(work);
        while (n-- > 0 && !maxHeap.isEmpty() && maxHeap.peek() > 0) {
            maxHeap.add(maxHeap.poll() - 1);
        }
        return maxHeap.stream().mapToLong(value -> (long) value * value).sum();
    }
}
