package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Solution3 {
    public HashSet<String> hashSet = new HashSet<>();
    public int index = 1;

    public void findComb(int[][] src, String output, int x, int y) {
        if (x == 4) {
            if (!output.equals("")) {
                hashSet.add(output);
            }
        } else {
            if (y == 31) {
                findComb(src, output, x + 1, 0);
            } else {
                if (src[x][y] != 0)
                    findComb(src, output + src[x][y], x + 1, 0);
                findComb(src, output, x, y + 1);
            }
        }
    }


    public int solution(String[][] clothes) {
        int[][] combination = new int[4][31];
        HashMap<String, Integer> hashMap = new HashMap<>();
        int combX = 0;
        int x = clothes.length;
        int y = clothes[0].length;

        for (int i = 0; i < clothes.length; i++) {
            if (hashMap.containsKey(clothes[i][1]))
                hashMap.put(clothes[i][1], hashMap.get(clothes[i][1]) + 1);
            else
                hashMap.put(clothes[i][1], 1);
        }

        for (int i : hashMap.values()) {
            for (int j = 0; j < i; j++) {
                combination[combX][j] = index;
            index++;
            }
            combX++;
        }

        findComb(combination, "", 0, 0);

        return hashSet.size();
    }
}
