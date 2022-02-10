package com.company;

public class Solution {
    public int solution(String s) {
        StringBuffer sb = new StringBuffer(s);

        if (sb.length() % 2 != 0)
            return 0;
        else {
            int i = 0;
            while (sb.length() > 0) {
                if (i < sb.length() - 1) {
                    if (sb.charAt(i) == sb.charAt(i + 1)) {
                        sb.replace(i, i + 2, "");
                        i = 0;
                    } else
                        i++;
                }
                else
                    break;
            }
        }
        if (sb.length() == 0)
            return 1;
        else
            return 0;
    }
}