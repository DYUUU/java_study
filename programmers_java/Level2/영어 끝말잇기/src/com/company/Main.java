package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] str = {
                "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int n = 3;
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(n, str)));
    }
}
