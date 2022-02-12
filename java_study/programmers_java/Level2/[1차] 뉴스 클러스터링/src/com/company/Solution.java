package com.company;

import java.util.ArrayList;

public class Solution {
    public int solution(String str1, String str2) {
        ArrayList<String> strArrList1 = new ArrayList<>();
        ArrayList<String> strArrList2 = new ArrayList<>();
        int sizeOfIntersection = 0;
        int sizeOfSumOfSets = 0;

        initArrList(str1, strArrList1);
        initArrList(str2, strArrList2);

        sizeOfIntersection = getIntersection(strArrList1, strArrList2);
        sizeOfSumOfSets = strArrList1.size() + strArrList2.size();

        if (sizeOfSumOfSets == 0) {
            return 65536;
        } else {
            return (int) (((float) sizeOfIntersection / (float) sizeOfSumOfSets) * 65536);
        }
    }

    // 교집합 구하기
    public int getIntersection(ArrayList<String> strArr1
            , ArrayList<String> strArr2) {

        ArrayList<String> strIntersection = new ArrayList<>();

        if (strArr1.size() >= strArr2.size()) {
            loop(strArr1, strArr2, strIntersection);
        }
        else{
            loop(strArr2, strArr1, strIntersection);
        }

        return strIntersection.size();
    }

    private void loop(ArrayList<String> strArr1, ArrayList<String> strArr2, ArrayList<String> strIntersection) {
        for (int i = 0; i < strArr2.size(); i++) {
            for (int j = 0; j < strArr1.size(); j++) {
                if (strArr2.get(i).equals(strArr1.get(j))) {
                    strIntersection.add(strArr1.get(j));
                    strArr1.remove(j);
                    j=0;
                    break;
                }
            }
        }
    }

    public void initArrList(String str, ArrayList<String> strArr) {
        char ch1 = ' ';
        char ch2 = ' ';
        str = str.toUpperCase();
        for (int i = 0; i < str.length() - 1; i++) {
            ch1 = str.charAt(i);
            ch2 = str.charAt(i + 1);

            if (ch1 >= 'A' && ch1 <= 'Z'
                    && ch2 >= 'A' && ch2 <= 'Z')
                strArr.add(String.valueOf(ch1) + ch2);
        }
    }
}