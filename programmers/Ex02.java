package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{new int[]{2, 5, 3}, new int[]{4, 4, 1}, new int[]{1, 7, 3}})));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = commands[i][0]-1; j <= commands[i][1]-1; j++) {
                list.add(array[j]);
            }
            List<Integer> sortedList =  list.stream().sorted().collect(Collectors.toList());

            answer[i]=sortedList.get(commands[i][2]-1);
        }
        return answer;
    }

}
