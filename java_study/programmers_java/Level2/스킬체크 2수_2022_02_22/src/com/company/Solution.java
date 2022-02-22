package com.company;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Solution {
    public HashMap<String, Integer> combinedComb = new HashMap<>();
    public int[] lengthMax;

    public void findCourse(String comb, String order, int current) {
        if (current == order.length()) {
            if (!comb.equals("")) {
                if (!combinedComb.containsKey(comb))
                    combinedComb.put(comb, 1);
                else {
                    combinedComb.put(comb, combinedComb.get(comb) + 1);
                    if (lengthMax[comb.length()] < combinedComb.get(comb)) {
                        lengthMax[comb.length()] = combinedComb.get(comb);
                    }
                }
            }
        } else {
            findCourse(comb + String.valueOf(order.charAt(current)), order, current + 1);
            findCourse(comb, order, current + 1);
        }


    }

    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        int max = 0;
        lengthMax = new int[orders.length + 1];
        ArrayList<String> result = new ArrayList<>();

        System.out.println(Arrays.toString(orders));

        for (int i = 0; i < orders.length; i++) {
            char[] ch = orders[i].toCharArray();
            Arrays.sort(ch);
            findCourse("",String.valueOf(ch), 0);
            if (max < orders[i].length())
                max = orders[i].length();
        }

        for (int i : course) {
            for (String key : combinedComb.keySet()) {
                int value = combinedComb.get(key);
                if (key.length() == i) {
                    if (value == lengthMax[i]) {
                        result.add(key);
                    }
                }
            }
        }

        result.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(result);


        return result.toArray(new String[0]);

    }
}
