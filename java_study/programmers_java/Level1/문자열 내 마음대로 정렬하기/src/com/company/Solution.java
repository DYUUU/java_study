package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (str.size() == 0) {
                str.add(strings[i]);
                continue;
            }
            for (int j = 0; j < str.size(); j++) {
                if (strings[i].charAt(n) < str.get(j).charAt(n)) {
                    for(int k = str.size(); k > 0;k--) {
                        if (k >= 2) {
                            str.add(str.get(k - 1));
                            str.set(k - 1, str.get(k - 2));
                        }
                        else {
                            str.set(0, strings[i]);
                        }
                    }

                } else if (strings[i].charAt(n) == str.get(j).charAt(n)) {
                    if (strings[i].charAt(n + 1) < str.get(j).charAt(n + 1)) {
                        str.add( str.get(j));
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

        System.out.println(str);

        return answer;
    }
}
