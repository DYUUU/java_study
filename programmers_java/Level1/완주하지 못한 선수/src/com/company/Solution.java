package com.company;

import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap();
        String answer = "";
        for (int i = 0; i < participant.length; i++) {
            if (hashMap.containsKey(participant[i]))
                hashMap.put(participant[i],  hashMap.get(participant[i]) + 1);
            else
                hashMap.put(participant[i], 1);
        }
        for (int i = 0; i < completion.length; i++) {
            hashMap.put(completion[i], hashMap.get(completion[i]) - 1);
        }
        for (String str : hashMap.keySet()) {
            if (hashMap.get(str) >= 1) {
                answer = str;
                break;
            }
        }
        return answer;
    }
}