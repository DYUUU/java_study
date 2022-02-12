package com.company;


import java.util.ArrayList;

class Solution {
    public int solution(int n) {
//        ArrayList<Integer> arrList = new ArrayList<>();
//
//        for (int i = 2; i <= n; i++) {
//            arrList.add(i);
//        }
//
//        // 에라토스테네스의 체 안됨 ㅠ
//        for (int i = 0; i < arrList.size(); i++) {
//            for (int j = arrList.get(i); j <= n / arrList.get(i); j++) {
//                arrList.remove(Integer.valueOf(arrList.get(i) * j));
//            }
//        }

        // 정수론 실패!! ㅠㅠ 도저히 몰겟삼~~~
        ArrayList<Integer> intArr = new ArrayList<>();
        boolean flag = true;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < intArr.size(); j++) {
                if (i % intArr.get(j) == 0) {
                        flag = false;
                        break;
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