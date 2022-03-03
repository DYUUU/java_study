package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int solution(int n, int[][] results) {
        HashMap<Integer, ArrayList<Integer>> rank = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int frontIdx = 0;
        int lastIdx = 0;

        for (int i = 0; i < n; i++)
            rank.put(i+1, new ArrayList<>());

        for (int i = 0; i < n; i++) {
            int winner = results[i][0];
            int loser = results[i][1];

            for (int j = 0; j < n; j++) {
                // winner
                // winner가 기존에 있을 때
                if (rank.get(j + 1).contains(winner)) {
                    if (frontIdx == 0) {
                        frontIdx = j + 1;
                    }
                }
                // winner가 기존에 없을 때
                else {
                    arr = rank.get(j + 1);
                    arr.add(winner);
                    rank.put(j + 1, arr);
                    if (frontIdx == 0)
                        frontIdx = j + 1;
                }
                // loser
                // loser가 기존에 없을 때
                if (!rank.get(j+1).contains(loser)) {
                    if (frontIdx + j + 1 <= n) {
                        arr = rank.get(frontIdx + j + 1);
                        arr.add(loser);
                        rank.put(frontIdx + j + 1, arr);
                        lastIdx = frontIdx + j + 1;
                    }
                }
                // loser가 기존에 있을 때
                else {

                }
            }
            if (lastIdx != 0) {
                if (rank.get(lastIdx).contains(winner)) {
                    arr = rank.get(lastIdx);
                    arr.remove(Integer.valueOf(winner));
                    rank.put(lastIdx, arr);
                }
            }

            frontIdx = 0;
            lastIdx = 0;
        }

        return 1;
    }
}
