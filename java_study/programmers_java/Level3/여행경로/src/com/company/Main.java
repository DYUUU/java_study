package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[][] tickets1 = {
                {"ICN", "JFK"},
                {"HND", "IAD"},
                {"JFK", "HND"}
        };
        String[][] tickets2 = {
                {"ICN", "SFO"},
                {"ICN", "ATL"},
                {"SFO", "ATL"},
                {"ATL", "ICN"},
                {"ATL", "SFO"}
        };

        Solution sol = new Solution();
//        sol.solution(tickets1);
        sol.solution(tickets2);
    }
}
