package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[][] clothes = {
                {"yellowhat", "headgear"},
                {"bluesunglasses", "eyewear"},
                {"green_turban", "headgear"}};

        Solution sol = new Solution();
        Solution2 sol2 = new Solution2();
        Solution3 sol3 = new Solution3();

        sol3.solution(clothes);
    }
}
