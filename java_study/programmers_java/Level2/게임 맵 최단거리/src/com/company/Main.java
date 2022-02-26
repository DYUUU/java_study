package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] maps1 = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };
        int[][] maps2 = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,0},
                {0,0,0,0,1}
        };

        Solution sol = new Solution();
        sol.solution(maps1);
//        sol.solution(maps2);
    }
}
