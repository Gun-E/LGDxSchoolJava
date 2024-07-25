package 알고리즘__스터디;

import java.util.Map;

public class Ex04 {
    public static void main(String[] args) {
        Map<Integer,Integer> segments = Map.of(
                0,6,
                1,2,
                2,5,
                3,5,
                4,4,
                5,5,
                6,6,
                7,3,
                8,7,
                9,6
        );

        int[] segmentCount = new int[60];

        for (int i = 0; i < segmentCount.length; i++) {
            int tens = i / 10;
            int ones = i % 10;
            segmentCount[i] = segments.get(tens) + segments.get(ones);
        }

        int count = 0;

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    int sum = segmentCount[i] + segmentCount[j] + segmentCount[k];
                    if (sum == 30) count++;
                }
            }
        }

        System.out.println(count);
    }
}
