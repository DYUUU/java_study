package com.company;

import java.util.Arrays;

public class Solution {

    public int findDown(int[] src, int current, int num)
    {
        for(int i = current ; i<src.length;i++) {
            if (src[i] < num)
                return i-current;
        }
        return src.length-current-1;
    }


    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0 ;i <prices.length;i++)
        {
            answer[i] = findDown(prices,i,prices[i]);

        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
