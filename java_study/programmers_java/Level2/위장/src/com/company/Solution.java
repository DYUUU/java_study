package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Solution {
    public int count = 0;
    public HashMap<String, String> output = new HashMap<>();

    public void DFS(LinkedHashMap<String, String> spyClothes, HashMap<String, String> output, int current, boolean flag) {
        if (current <= spyClothes.size()) {
            if(current==0)
            {
                DFS(current)
            }
            if (flag) {
                int cnt = 0;
                for (String clothes : spyClothes.keySet()) {
                    if (cnt == current) {
                        if (!output.containsValue(clothes)) {
                            output.put(spyClothes.get(clothes), clothes);
                            count++;
                            System.out.println(output);
                        }
                        output.put(spyClothes.get(clothes), "");
                    } else {
                        cnt++;
                    }
                }
            } else {
                DFS(spyClothes, output, current + 1, false);
                DFS(spyClothes, output, current + 1, true);
            }

        }
    }


    public int solution(String[][] clothes) {
        int answer = 0;
        LinkedHashMap<String, String> spyClothes = new LinkedHashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            spyClothes.put(clothes[i][0], clothes[i][1]);
        }

        for (String key : spyClothes.keySet()) {
            output.put(spyClothes.get(key), "");
        }

        DFS(spyClothes, output, 0, false);

        System.out.println(count);

        return count;
    }
}
