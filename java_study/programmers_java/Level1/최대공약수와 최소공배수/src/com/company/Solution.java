package com.company;

public class Solution {
    public int[] solution(int n, int m)
    {
        int[] answer = {1,1};

        for(int i = 1; i < Math.max(n,m) ; i++)
        {
            if(n % i ==0 && m % i ==0)
            {
                n/=i;
                m/=i;
                answer[0] *= i;
                i = 1;
            }
        }
        answer[1] = answer[0] * n * m;
        return answer;
    }
}
