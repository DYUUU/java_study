package com.company;


import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;

        Arrays.sort(answer, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n)==o2.charAt(n)) {
                    return o1.compareTo(o2);
                }
                return o1.charAt(n)-o2.charAt(n);
            }
        });

        System.out.println(Arrays.toString(answer));


        return answer;
    }
}
