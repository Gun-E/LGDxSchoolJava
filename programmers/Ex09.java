package programmers;

import java.util.*;

public class Ex09 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})));
    }
    public static int[] solution(String[] genres, int[] plays) {
        HashMap<String, HashMap<Integer, Integer>> map = new HashMap<>();
        HashMap<String, Integer> genrePlayCount = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.putIfAbsent(genres[i], new HashMap<>());
            map.get(genres[i]).put(i, plays[i]);
            genrePlayCount.put(genres[i], genrePlayCount.getOrDefault(genres[i], 0) + plays[i]);
        }
        List<String> genreOrder = new ArrayList<>(genrePlayCount.keySet());
        genreOrder.sort((a, b) -> genrePlayCount.get(b) - genrePlayCount.get(a));
        List<Integer> result = new ArrayList<>();

        for (String genre : genreOrder) {

            List<Map.Entry<Integer, Integer>> songs = new ArrayList<>(map.get(genre).entrySet());
            songs.sort((a, b) -> {
                if (b.getValue().equals(a.getValue())) {
                    return a.getKey() - b.getKey();
                } else {
                    return b.getValue() - a.getValue();
                }
            });

            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                result.add(songs.get(i).getKey());
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
    // 해시맵
    /*
     HashMap<String, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.putIfAbsent(genres[i], new HashMap<>());
            map.get(genres[i]).put(i, plays[i]);
        }
        map.forEach((k,v) -> System.out.println(k+" "+ v.values()));
     */
}
