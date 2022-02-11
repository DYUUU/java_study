package com.company;

import java.util.Arrays;
public class Solution {
    public int solution(String s) {
        int[] alphabet = new int[26];
        int dist = 0;

        if (s.length() % 2 != 0) return 0;
        else {
            for (int i = 0; i < s.length(); i++) {
                if (alphabet[s.charAt(i) - 'a'] == 0)
                    alphabet[s.charAt(i) - 'a'] = i ;
                else {
                    dist = Math.abs(alphabet[s.charAt(i) - 'a'] - i);
                    if (dist == 1)
                    {
                        alphabet[s.charAt(i) - 'a'] = 0;
                        continue;
                    }
                    else if (dist % 2 == 0)
                        return 0;
                    else
                        alphabet[s.charAt(i) - 'a'] = 0;
                }
            }
        }
        return 1;
    }
}