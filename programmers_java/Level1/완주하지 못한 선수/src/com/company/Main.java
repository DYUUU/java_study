package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] participant = {
                "mislav", "stanko", "mislav", "ana"
        };
        String[] completion = {
                "stanko", "ana", "mislav"
        };

        Solution sol = new Solution();
        System.out.println(sol.solution(participant,completion));
    }
}
