package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Solution {
    public int count = 0;
    public HashMap<String, String> output = new HashMap<>();
    public HashSet<String> hashSet = new HashSet<>();

    public void DFS(LinkedHashMap<String, String> spyClothes, HashMap<String, String> output, int current, boolean flag) {
        if (current <= spyClothes.size()) {
            // flag가 true 일 경우 map 에 추가
            if (flag) {
                int cnt = 0;
                for (String clothes : spyClothes.keySet()) {
                    if (cnt == current) {
                        output.put(spyClothes.get(clothes), clothes);
                        hashSet.add(output.toString());
                    } else {
                        cnt++;
                    }
                }

                for (String clothes : spyClothes.values()) {
                    output.put(clothes, "");
                }
            }
            // flag가 false일 경우 current를 1 증가시켜 다시 탐색
            else {
                DFS(spyClothes, output, current + 1, true);
                DFS(spyClothes, output, current + 1, false);
            }

        }
    }


    public int solution(String[][] clothes) {
        int answer = 0;
        LinkedHashMap<String, String> spyClothes = new LinkedHashMap<>();

        // spyClothes 해쉬맵에 추가 (옷, 옷 종류)
        for (int i = 0; i < clothes.length; i++) {
            spyClothes.put(clothes[i][0], clothes[i][1]);
        }

        // output 해쉬맵에 추가 (옷 종류, 옷)
        for (String tmpClothes : spyClothes.values()) {
            output.put(tmpClothes, "");
        }

        DFS(spyClothes, output, 0, true);
        DFS(spyClothes, output, 0, false);

        System.out.println(hashSet);
        System.out.println(hashSet.size());

        return hashSet.size();
    }
}