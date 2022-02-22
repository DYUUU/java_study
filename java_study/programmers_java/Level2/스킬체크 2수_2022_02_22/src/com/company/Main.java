package com.company;

public class Main {


    public static void main(String[] args) {
        // write your code here
        String[] orders1 = {
                "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"
        };
        int[] course1 = {
                2, 3, 4
        };
        String[] orders2 = {
                "XYZ", "XWY", "WXA"
        };
        int[] course2 = {
                2,3,4
        };
        Solution sol = new Solution();
        sol.solution(orders2, course2);
    }
}
