package com.company;


import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap hashMap = new HashMap();
        int tmp = 0;
        for(int i = 0; i <completion.length;i++)
        {
            hashMap.put(completion[i],i);
        }
        for(int i = 0; i<participant.length;i++)
        {
            if(!hashMap.containsKey(participant[i]))
                tmp = i;
        }
        return participant[tmp];
    }
}