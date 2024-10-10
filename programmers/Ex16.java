package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Ex16 {
    public static void main(String[] args) {
        Ex16 ex16 = new Ex16();
        System.out.println(ex16.solution(2,10, new int[]{7,4,5,6}));
        System.out.println(ex16.solution(100,100, new int[]{10}));
        System.out.println(ex16.solution(100,100, new int[]{10,10,10,10,10,10,10,10,10,10}));
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> bridge = new LinkedList<>();

        int time = 0; // 총 시간
        int currentWeight = 0; // 현재 다리 위의 트럭 무게 합
        int index = 0; // 대기 중인 트럭의 인덱스

        while (index < truck_weights.length || !bridge.isEmpty()) {
            time++; // 시간 1초 증가

            // 다리 위의 트럭 중 시간이 다 된 트럭을 내립니다.
            if (!bridge.isEmpty()) {
                Truck frontTruck = bridge.peek();
                frontTruck.time -= 1;
                if (frontTruck.time == 0) {
                    currentWeight -= frontTruck.weight;
                    bridge.poll(); // 트럭을 다리에서 내립니다.
                }
            }

            // 다음 트럭이 다리에 올라갈 수 있는지 확인
            if (index < truck_weights.length) {
                int nextTruckWeight = truck_weights[index];
                if (currentWeight + nextTruckWeight <= weight) {
                    // 트럭을 다리에 올립니다.
                    bridge.offer(new Truck(nextTruckWeight, bridge_length));
                    currentWeight += nextTruckWeight;
                    index++; // 다음 트럭으로 이동
                }
            }
        }

        return time;
    }

    // 트럭을 나타내는 클래스
    static class Truck {
        int weight; // 트럭의 무게
        int time;   // 다리 위에서 남은 시간

        Truck(int weight, int time) {
            this.weight = weight;
            this.time = time;
        }
    }
}
