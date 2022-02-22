package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] orders = {
                "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"
        };
        int[] course =
                {
                        2, 3, 4
                };
        Solution sol = new Solution();
        sol.solution(orders,course);
    }
}
