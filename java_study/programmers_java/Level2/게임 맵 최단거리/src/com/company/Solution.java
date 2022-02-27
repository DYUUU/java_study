package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public ArrayList<int[]> coordinates = new ArrayList<>();

    public void checkOpenedPlace(int x, int y, int count, int[][] maps, HashMap<String, Integer> move) {
        int check = 0;
        count+=1;
        // 상
        if (x - 1 >= 0) {
            if (maps[x - 1][y] == 1 || maps[x - 1][y] > count) {
                move.put("up", 1);
                check++;
            }
        }
        // 하
        if (x + 1 <= maps.length - 1) {
            if (maps[x + 1][y] == 1 || maps[x + 1][y] > count) {
                 move.put("down", 1);
                check++;
            }
        }
        //좌
        if (y - 1 >= 0) {
            if (maps[x][y - 1] == 1 || maps[x][y - 1] > count) {
                move.put("left", 1);
                check++;
            }
        }
        if (y + 1 <= maps[0].length - 1) {
            if (maps[x][y + 1] == 1 || maps[x][y + 1] > count) {
                move.put("right", 1);
                check++;
            }
        }
        count-=1;
        if (--check >= 1) {
            for (int i = 0; i < check; i++) {
                coordinates.add(new int[]{x, y, count});
            }
        }
    }

    public int solution(int[][] maps) {
        int x_max = maps.length - 1;
        int y_max = maps[0].length - 1;
        int count = 1;
        int answer = 0;
        HashMap<String, Integer> move = new HashMap<>();

        move.put("up", 0);
        move.put("down", 0);
        move.put("left", 0);
        move.put("right", 0);

        maps[0][0] = 0;
        coordinates.add(new int[]{0, 0, count});

        if (maps[x_max - 1][y_max] == 0 && maps[x_max][y_max - 1] == 0) {
            return -1;
        } else {
            while (maps[x_max][y_max] == 1) {
                for (int i = 0; i < coordinates.size(); i++) {
                    int[] coordinate = coordinates.get(i);
                    int x = coordinate[0];
                    int y = coordinate[1];
                    int tmpCount = coordinate[2];

                    // 사방면 체크
                    if (!move.containsValue(1)) {
                        checkOpenedPlace(x, y, tmpCount, maps, move);
                    }
                    if (!move.containsValue(1))
                    {
                        coordinates.remove(i);
                    }
                    // 상

                    if (move.get("up") == 1) {
                        maps[--x][y] = ++tmpCount;
                        coordinates.set(i, new int[]{x, y, tmpCount});
                        move.put("up", 0);
                        continue;
                    }
                    // 하
                    if (move.get("down") == 1) {
                        maps[++x][y] = ++tmpCount;
                        coordinates.set(i, new int[]{x, y, tmpCount});
                        move.put("down", 0);
                        continue;
                    }
                    // 좌
                    if (move.get("left") == 1) {
                        maps[x][--y] = ++tmpCount;
                        coordinates.set(i, new int[]{x, y, tmpCount});
                        move.put("left", 0);
                        continue;
                    }
                    // 우
                    if (move.get("right") == 1) {
                        maps[x][++y] = ++tmpCount;
                        coordinates.set(i, new int[]{x, y, tmpCount});
                        move.put("right", 0);
                        continue;
                    }
                }
            }
        }

        answer = maps[x_max][y_max];
        System.out.println(answer);

        return answer;
    }
}