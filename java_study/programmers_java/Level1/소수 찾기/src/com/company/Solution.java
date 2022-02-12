package com.company;


import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> intArr = new ArrayList<>();
        boolean flag = true;

        intArr.add(2);

        for (int i = 3; i <= n; i++) {
            for (int j = 0; j < intArr.size(); j++) {
                if (i % intArr.get(j) == 0) {
                    if (i != intArr.get(j)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                intArr.add(i);
                flag = false;
            } else
                flag = true;
        }

        return intArr.size();
    }
}