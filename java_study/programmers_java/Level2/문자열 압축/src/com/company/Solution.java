package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class Solution {
    public int solution(String s) {
        String cmp = "";
        String cmpS = "";
        String str = "";
        int cnt = 0;
//        ArrayList<String> result = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();


        for (int i = 1; i <= s.length() / 2; i++) {
            cmp = s.substring(0, i);
            for (int j = i; j < s.length(); j += cmp.length()) {
                if (j + cmp.length() <= s.length()) {
                    cmpS = s.substring(j, j + cmp.length());
                    if (cmp.equals(cmpS)) {
                        cnt++;
                    } else {
                        if (cnt <= 1)
                            str += cmp;
                        else
                            str += cnt + cmp;
                        cnt = 1;
                    }
                    cmp = cmpS;
                    if (j + cmp.length()+ cmp.length() > s.length()) {
                        if (cnt <= 1)
                            str += cmp;
                        else
                            str += cnt + cmp;
                        cnt = 1;
                        str+=s.substring(j+ cmp.length(), s.length());
                    }
                }
            }
//            result.add(str);
            result.add(str.length());
            str = "";
        }

        System.out.println(result);
        return Collections.min(result);
//        return 1;
    }
}
