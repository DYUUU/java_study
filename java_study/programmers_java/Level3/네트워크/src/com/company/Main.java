package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] computers = {{1,1,0},{1,1,1},{0,1,1}};
        int n = 3;

        Solution sol = new Solution();
        sol.solution(n,computers);
    }
}
