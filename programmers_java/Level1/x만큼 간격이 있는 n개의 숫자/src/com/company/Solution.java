package com.company;

import java.util.Arrays;

public class Solution{
    public long[] solution (int x, int n){

        long[] answer = new long[n];
        for(int i = 0 ; i <n;i++)
        {
            if(i==0)
                answer[i] = x;
            else
                answer[i] = answer[i-1]+x;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

