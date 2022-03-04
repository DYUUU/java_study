package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o1)-Integer.valueOf(o2);
            }
        });

        answer =  str[0] + " " + str[str.length-1];

        System.out.println(answer);

        return answer;
    }
}
