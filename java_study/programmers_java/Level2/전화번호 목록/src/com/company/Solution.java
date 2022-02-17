package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++)
                if (phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length())))
                    answer = false;
        }
        return answer;
    }

}