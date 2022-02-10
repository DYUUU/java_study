package com.company;

import java.util.Arrays;

public class Solution {
    public int solution(String s) {
        int[] alphabet = new int[26];
        boolean flag = false;

        if (s.length() % 2 != 0) return 0;
        else {
            for (int i = 0; i < s.length(); i++) {
                alphabet[s.charAt(i) - 'a']++;
                if (i + 1 == s.length()) break;
                if (s.charAt(i) == s.charAt(i + 1)) {
                    flag = true;
                }
            }
       }
        if (flag) {
            for(int j = 0 ; j < alphabet.length;j++)
            {
                if(alphabet[j]%2!=0)
                    return 0;
            }
            return 1;
        } else
            return 0;
    }
}