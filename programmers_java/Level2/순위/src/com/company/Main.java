package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 5;
        int[][] results = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};

        int n2 = 4;
        int[][]results2 = {{1,2},{2,3},{1,4}};
        Solution sol = new Solution();
        sol.solution(n,results);
//        sol.solution(n2,results2);

    }
}
