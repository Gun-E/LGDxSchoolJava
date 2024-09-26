package programmers;

import java.util.*;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.stream(participant).forEach(a -> map.put(a, map.getOrDefault(a, 0) + 1));
        Arrays.stream(completion).forEach(v -> {
            if(map.containsKey(v)) map.put(v, map.get(v) - 1);
        });

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
}
