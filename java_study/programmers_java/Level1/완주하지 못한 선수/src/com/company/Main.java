package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] participant = {
                "marina", "josipa", "nikola", "vinko", "filipa"
        };
        String[] completion = {
                "josipa", "filipa", "marina", "nikola"
        };

        Solution sol = new Solution();
        System.out.println(sol.solution(participant,completion));
    }
}
