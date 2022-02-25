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
                {"ATL", "SFO"},
        };

        String[][] tickets3=  {
                {"ICN", "A"},
                {"ICN", "A"},
                {"ICN", "A"},
                {"A", "ICN"},
                {"A", "ICN"},
        };

        Solution sol = new Solution();
//        sol.solution(tickets1);
//        sol.solution(tickets2);
         sol.solution(tickets3);
    }
}
