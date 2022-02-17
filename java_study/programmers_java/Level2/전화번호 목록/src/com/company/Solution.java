package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();
        Arrays.sort(phone_book);
        boolean answer = true;
        for (int i = 0; i < phone_book.length; i++) {
            String tmp = phone_book[i];
            for (int j = 0; j < tmp.length(); j++) {
                if (set.contains(tmp.substring(0, j + 1))) {
                    answer = false;
                    break;
                }
            }
            set.add(tmp);
            if (!answer)
                break;
        }
        return answer;
    }
}