package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        char[] tmp = str.toCharArray();

        return Long.valueOf(new StringBuilder(new String(tmp)).reverse().toString());
    }
}