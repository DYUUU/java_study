package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] computers = {{1,1,0},{1,1,1},{0,1,1}};
//        int[][] computers2 = {{1,1,0},{1,1,0},{0,0,1}};
        int n = 3;

        Solution sol = new Solution();
        sol.solution(n,computers);
//        sol.solution(n,computers2);
//        sol.solution(4,new int[][] {{1,0,1,1},{0,1,0,1},{1,0,1,1},{1,1,1,1}});
//        sol.solution(4,new int[][] {{0,0,0,0},{0,1,0,1},{0,0,1,0},{0,1,0,1}});
//        sol.solution(7,new int[][] {{1,1,1,0,0,0,0},{0,1,0,1,1,1,1},{1,1,1,0,0,0,0},{0,1,0,1,1,1,1},{0,1,0,1,1,1,1},{0,1,0,1,1,1,1},{0,1,0,1,1,1,1}});
//        sol.solution(5,new int[][] {{1,0,0,0,1},{0,1,0,0,1},{0,0,1,0,1},{0,0,0,1,1},{1,1,1,1,1}});
    }
}
