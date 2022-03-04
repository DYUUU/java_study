package com.company;

public class Solution2 {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i])
                sum += absolutes[i];
            else
                sum -= absolutes[i];
        }

        System.out.println(sum);

        return sum;
    }
}
