package com.company;


public class Solution {
    public String solution(String[] participant, String[] completion) {
        boolean[] answer = new boolean[completion.length];
        boolean flag = false;
        int tmp = 0;

        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < completion.length; j++)
                if (!answer[j]) {
                    if (participant[i] == completion[j]) {
                        answer[j] = true;
                        flag = true;
                        break;
                    }
                }
            if (!flag) {
                tmp = i;
                break;
            }
            else
                flag = false;
        }

        return participant[tmp];
    }
}