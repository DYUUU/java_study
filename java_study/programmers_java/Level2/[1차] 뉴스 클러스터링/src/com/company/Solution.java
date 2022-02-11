package com.company;
import java.util.ArrayList;

public class Solution {
    public int solution(String str1, String str2) {
        ArrayList<String> strArrList1 = new ArrayList<>();
        ArrayList<String> strArrList2 = new ArrayList<>();
        int sizeOfIntersection = 0;
        int sizeOfSumOfSets = 0;
        float jacard = 0;

        initArrList(str1, strArrList1);
        initArrList(str2, strArrList2);

        sizeOfIntersection=getIntersection(strArrList1,strArrList2);
        sizeOfSumOfSets = strArrList1.size()+strArrList2.size()-sizeOfIntersection;

        if (sizeOfSumOfSets == 0) {
            return 65536;
        } else {
            jacard = ((float)sizeOfIntersection / (float)sizeOfSumOfSets);
            return (int) (jacard * 65536);
        }
    }

    // 교집합 구하기
    public int getIntersection(ArrayList<String> strArr1
            , ArrayList<String> strArr2) {

        ArrayList<String> strIntersection = new ArrayList<>();
        int min = Math.min(strArr1.size(), strArr2.size());

        for (int i = 0; i < min; i++) {
            if (min == strArr1.size()) {
                if (strArr2.contains(strArr1.get(i))) {
                    strIntersection.add(strArr1.get(i));
                }
            } else {
                if (strArr1.contains(strArr2.get(i))) {
                    strIntersection.add(strArr2.get(i));
                }
            }
        }

        return strIntersection.size();
    }

    public void initArrList(String str, ArrayList<String> strArr) {
        char ch1 = ' ';
        char ch2 = ' ';
        String tmp = "";
        for (int i = 0; i < str.length() - 1; i++) {
            ch1 = Character.toUpperCase(str.charAt(i));
            ch2 = Character.toUpperCase(str.charAt(i + 1));
            tmp = String.valueOf(ch1) + ch2;
            if (ch1 >= 'A' && ch1 <= 'Z'
                    && ch2 >= 'A' && ch2 <= 'Z')
                    strArr.add(tmp);
        }
    }
}