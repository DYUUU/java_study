package com.company;


import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] boolArr = new boolean[n + 1];

        // 에라토스테네스의 체
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = i; j <= n / i; j++) {
                boolArr[i * j] = true;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!boolArr[i])
                answer++;
        }

        return answer;
    }
}