package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 최대 힙 (중간값 이하의 값들 저장)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // 최소 힙 (중간값 이상의 값들 저장)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // 결과를 저장할 리스트
        List<Integer> results = new ArrayList<>();

        // 입력값 처리
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            // 우선 최대 힙에 추가
            maxHeap.offer(num);

            // 최대 힙의 루트가 최소 힙의 루트보다 크면 swap
            if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                minHeap.offer(maxHeap.poll());
                maxHeap.offer(minHeap.poll());
            }

            // 힙의 크기 조정: 최대 힙은 최소 힙보다 1개 더 많거나 같아야 함
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.offer(maxHeap.poll());
            }

            // 현재 중간값 저장
            results.add(maxHeap.peek());
        }

        // 결과를 한 번에 출력
        results.forEach(System.out::println);
    }
}
