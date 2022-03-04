package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] progresses = {
                93, 30, 55
        };
        int[] speed = {
                1, 30, 5
        };

        int[] progresses2 = {
                95, 90, 99, 99, 80, 99
        };
        int[] speed2 = {
                1, 1, 1, 1, 1, 1
        };


        Solution sol = new Solution();
//        sol.solution(progresses,speed);
        sol.solution(progresses2,speed2);
    }
}
