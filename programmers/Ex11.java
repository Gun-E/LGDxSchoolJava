package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            int progress = (100 - progresses[i]) / speeds[i];
            int over = (100 - progresses[i]) % speeds[i];

            if (over > 0) list.add(progress + 1);
            else list.add(progress);

        }
        List<Integer> counts = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int progress = list.get(i);
            int count = 1;
            try {
                while (list.get(i + count) <= progress) {
                    count++;
                }
            }catch (Exception ignored) {

            }
            counts.add(count);
            i+=count-1;
        }

        return counts.stream().mapToInt(i -> i).toArray();
    }
}
