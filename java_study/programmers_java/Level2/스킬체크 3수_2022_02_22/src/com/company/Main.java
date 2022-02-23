package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] prices = {
                1, 2, 3, 2, 3
        };

        Solution sol = new Solution();
//        sol.solution(prices);

        int[] progresses = {
                93, 30, 55
        };
        int[] speed = {
                1, 30, 5
        };
        Solution2 sol2 = new Solution2();
        sol2.solution(progresses, speed);
    }
}
