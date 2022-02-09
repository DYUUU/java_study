package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution1 sol1 = new Solution1();
        Solution2 sol2 = new Solution2();

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        sol1.solution(arr,divisor);

        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        sol2.solution(absolutes,signs);
    }
}
