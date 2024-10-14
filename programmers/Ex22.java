package programmers;

import java.util.*;

public class Ex22 {
    public static void main(String[] args) {
        Ex22 ex22 = new Ex22();
        System.out.println(ex22.solution(3,new int[][]{{1,1,0}, {1,1,0}, {0,0,1}}));
        System.out.println(ex22.solution(3,new int[][]{{1,1,0}, {1,1,1}, {0,1,1}}));
    }
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int networkCount = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(i, computers, visited);
                networkCount++;
            }
        }
        return networkCount;
    }

    private void bfs(int start, int[][] computers, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int i = 0; i < computers.length; i++) {
                if (computers[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
