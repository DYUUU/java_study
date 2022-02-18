package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution3 {
    public ArrayList<String> arr = new ArrayList<>();
    public int index = 1;

    public void findComb(int[][] src, String output, int x, int y) {
        if (x == 30) {
            if (!output.equals("")) {
                arr.add(output);
            }
        } else {
            if (y == 30) {
                findComb(src, output, x + 1, 0);
            } else {
                if (src[x][y] != 0) {
                    findComb(src, output, x, y + 1);
                    findComb(src, output + src[x][y], x + 1, 0);
                } else {
                    findComb(src, output, x + 1, 0);
                }
            }
        }
    }


    public int solution(String[][] clothes) {
        int[][] combination = new int[30][30];
        HashMap<String, Integer> hashMap = new HashMap<>();
        int combX = 0;

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

        System.out.println(arr.size());
        return arr.size();
    }
}
