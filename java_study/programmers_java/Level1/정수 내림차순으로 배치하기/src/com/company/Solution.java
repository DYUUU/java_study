package com.company;

import java.util.Arrays;

public class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        char[] tmp = str.toCharArray();
        Arrays.sort(tmp);

        return Long.valueOf(new StringBuilder(new String(tmp)).reverse().toString());
    }
}