package com.company;

import java.util.HashMap;

public class Solution3 {

    public int solution(String[][] clothes) {
        HashMap<String, Integer> hashMap = new HashMap<>();

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
