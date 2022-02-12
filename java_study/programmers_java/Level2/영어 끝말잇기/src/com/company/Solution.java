package com.company;

import java.util.HashSet;

public class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        HashSet<String> strHash = new HashSet<>();
        strHash.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            // 중복일 경우
            if (!strHash.add(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
                // 끝말잇기가 틀렸을 경우
            else if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                answer[0] =  (i+1) % n + 1;
                answer[1] =  (i+1) / n +1;
                break;
            }
        }

        return answer;
    }
}

