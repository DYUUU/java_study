package com.company;

public class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        int p = s.length()-s.replaceAll("P","").length();
        int y = s.length()-s.replaceAll("Y","").length();

        if(p==y)
            return true;
        else
            return false;
    }
}
