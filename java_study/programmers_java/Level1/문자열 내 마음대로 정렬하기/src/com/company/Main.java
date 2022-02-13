package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] strings = {"sun", "bed", "car"};
        String[] strs= {"abce", "abcd", "cdx"};
        int n = 1;
        int n2=2;

        Solution sol = new Solution();
        Solution2 sol2 = new Solution2();
        sol.solution(strings, n);
        sol2.solution(strings,n);
        sol2.solution(strs,n2);
    }
}
