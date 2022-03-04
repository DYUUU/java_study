package com.company;

import java.util.Arrays;

public class Solution2 {

    public int getChange(int[] prices, int current, int num) {
        for (int i = current; i < prices.length; i++) {
            if (num > prices[i]) {
                return i - current;
            }
        }
        return prices.length-1-current;
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            answer[i] = getChange(prices, i, prices[i]);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
