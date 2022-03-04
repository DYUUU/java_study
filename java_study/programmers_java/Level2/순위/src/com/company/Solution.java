package com.company;

import java.util.HashSet;

public class Solution {
    public boolean flag = false;
    public int number;

    public void DFS(boolean[][] table, int x, int y, HashSet<Integer> result) {
        for (int i = 0; i < number; i++) {
            // 이기는 경우
            if (flag) {
                if (table[x][i]) {
                    if(result.add(i))
                    DFS(table, i, 0, result);
                }
            }
            // 지는 경우
            if (!flag) {
                if (table[i][y]) {
                    if(result.add(i))
                    DFS(table, 0, i, result);
                }
            }
        }
    }

    public int solution(int n, int[][] results) {
        boolean[][] table = new boolean[n][n];
        HashSet<Integer> result = new HashSet<>();
        int answer = 0;
        number = n;

        for (int i = 0; i < results.length; i++) {
            int winner = results[i][0];
            int loser = results[i][1];
            table[winner - 1][loser - 1] = true;
        }

        // 가로->세로 DFS

            for (int i = 0; i < n; i++) {
                flag = true;
                DFS(table, i, 0, result);
                flag = false;
                DFS(table, 0, i, result);
                if (result.size() == number - 1) {
                    answer++;
                }
                System.out.println(result);
                result.clear();
            }

        return answer;
    }
}
