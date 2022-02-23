package com.company;

public class Main {

    public static void main(String[] args) {

        String[] record = {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };
        int[] prices = {
                1, 2, 3, 2, 3
        };

        Solution sol = new Solution();
        Solution2 sol2 = new Solution2();

//        sol.solution(record);
        sol2.solution(prices);
    }
}
