package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Solution2 {
    HashSet<String> answerHash = new HashSet<>();
    public int count;
    public boolean visit[];

    public void findComb(String src, String output, int current) {
        if (current == src.length()) {
            if (!output.equals("")) {
                count++;
                answerHash.add(output);
            }
        } else {
            for (int i = 1; i < src.length(); i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    findComb(src, output + src.charAt(i), current + 1);
                    findComb(src, output, current + 1);
                    visit[i] = false;
                }
            }
        }
    }

    public int solution(String[][] clothes) {
        HashMap<String, Integer> spyClothes = new HashMap<>();
        visit = new boolean[clothes.length];
        count = 0;
        String src = "";

        for (int i = 0; i < clothes.length; i++) {
            if (spyClothes.containsKey(clothes[i][1]))
                spyClothes.put(clothes[i][1], spyClothes.get(clothes[i][1]) + 1);
            else
                spyClothes.put(clothes[i][1], 1);
        }

        findComb(src, "", 0);

        System.out.println(answerHash);


        return count;

    }
}
