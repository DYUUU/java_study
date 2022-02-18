package com.company;

import java.util.HashMap;

public class Solution3 {


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

        int answer =1;
        for (int i : hashMap.values()) {
            answer *=i+1;
        }
        return answer-1;

    }
}
