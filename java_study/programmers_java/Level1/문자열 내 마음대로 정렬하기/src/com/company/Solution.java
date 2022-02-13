package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> str = new ArrayList<>();
        String tmp = "";
        for (int i = 0; i < strings.length; i++) {
            if (str.size() == 0) {
                str.add(strings[i]);
                continue;
            }
            for (int j = 0; j < str.size(); j++) {
                if (strings[i].charAt(n) > str.get(j).charAt(n)) {
                    tmp = str.get(j);
                    str.add(tmp);
                    str.set(0, strings[i]);
                    break;
                } else if (strings[i].charAt(n) == str.get(j).charAt(n)) {
                    if (strings[i].charAt(n + 1) > str.get(j).charAt(n + 1)) {
                        tmp = str.get(j);
                        str.add(tmp);
                        str.set(0, strings[i]);
                        break;
                    }
                    else {
                        str.add(strings[i]);
                        break;
                    }
                } else {
                    str.add(strings[i]);
                    break;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            answer[i] = str.get((strings.length-1)-i);
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
