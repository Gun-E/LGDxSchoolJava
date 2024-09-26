package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class Ex08 {
    public static void main(String[] args) {
        System.out.println(solution(new String[][]{new String[]{"yellow_hat", "headgear"}, new String[]{"blue_sunglasses", "eyewear"}, new String[]{"green_turban", "headgear"}}));
        System.out.println(solution(new String[][]{new String[]{"crow_mask", "face"}, new String[]{"blue_sunglasses", "face"}, new String[]{"smoky_makeup", "face"}}));
    }

    public static int solution(String[][] clothes) {
        HashMap<String,Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }
        int count = 1;
        for (String key : map.keySet()) {
            count *= map.get(key)+1;
        }
        return count-1;
    }
}
