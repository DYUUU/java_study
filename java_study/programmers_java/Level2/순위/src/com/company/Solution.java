package com.company;

import java.util.HashSet;

public class Solution {
    public boolean flag = false;

    public void DFS(boolean[][] table, int x, int y, int n, HashSet<Integer> result) {
        for (int i = 0; i < n; i++) {
            // 이기는 경우
            if (flag) {
                if (table[x][i]) {
                    result.add(i);
                    DFS(table, i, 0, n, result);
                }
            }
            // 지는 경우
            if (!flag) {
                if (table[i][y]) {
                    result.add(i);
                    DFS(table, 0, i, n, result);
                }
            }
        }
    }

    public int solution(int n, int[][] results) {
        boolean[][] table = new boolean[n][n];
        HashSet<Integer> result = new HashSet<>();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int winner = results[i][0];
            int loser = results[i][1];
            table[winner - 1][loser - 1] = true;
        }

        // 가로->세로 DFS

        for (int i = 0; i < n; i++) {
            flag = true;
            DFS(table, i, 0, n, result);
            flag = false;
            DFS(table, 0, i, n, result);
            if (result.size() == n - 1) {
                answer++;
            }
            result.clear();
        }


        return answer;
    }
}
