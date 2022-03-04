package com.company;

public class Solution {
    public boolean solution(int  x){
        boolean answer = false;
        char[] ch = String.valueOf(x).toCharArray();
        int sum = 0;

        for(int i =0;i<ch.length;i++)
            sum += ch[i] - '0';

        if(x%sum==0)
            answer = true;
        else
            answer = false;

        System.out.println(answer);

        return answer;
    }
}
