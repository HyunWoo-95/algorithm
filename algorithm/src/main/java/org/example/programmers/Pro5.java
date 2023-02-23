package org.example.programmers;

import java.util.*;

public class Pro5 {

    /*
    무인도 여행
     */
    List<Integer> island = new ArrayList<>();
    int sum = 0;
    boolean[][] visited;

    public int[] solution(String[] maps) {
        int[] answer = {};

        visited = new boolean[maps.length][maps[0].length()];

        for (int i = 0; i < maps.length; i++) {
            String[] map = maps[i].split("");
            for (int j = 0; j < map.length; j++) {
                if (!visited[i][j] && !map[j].equals("X")) {
                    cal(i, j, maps);
                    island.add(sum);
                    sum = 0;
                } else {
                    visited[i][j] = true;
                }
            }
        }

        if (island.size() == 0) {
            return new int[]{-1};
        }

        Collections.sort(island);

        answer = island.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public void cal(int i, int j, String[] maps) {

        if (maps[i].charAt(j) == 'X') {
            return;
        }

        visited[i][j] = true;
        sum += maps[i].charAt(j) - '0';

        if (i != maps.length - 1 && !visited[i + 1][j]) cal(i + 1, j, maps);
        if (i != 0 && !visited[i - 1][j]) cal(i - 1, j, maps);
        if (j != maps[0].length() - 1 && !visited[i][j + 1]) cal(i, j + 1, maps);
        if (j != 0 && !visited[i][j - 1]) cal(i, j - 1, maps);
    }
}

