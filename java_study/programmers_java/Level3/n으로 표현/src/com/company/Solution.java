package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public int solution(int N, int number) {
        ArrayList<HashMap<Integer, String>> result = new ArrayList<>();
        String strN = Integer.toString(N);
        int answer = 0;

        result.add(new HashMap<Integer, String>());
        result.add(new HashMap<Integer, String>());
        result.get(1).put(Integer.valueOf(strN), strN);
        for (int i = 2; i <= 8; i++) {
            result.add(new HashMap<Integer, String>());
            strN += N;
            result.get(i).put(Integer.valueOf(strN), strN);
            for (int j = 1; j <= (result.size() - 1) / 2;j++) {
                    for (int k = result.size() - 2; k >= (result.size()/ 2); k--,j++) {
                for (int key2: result.get(j).keySet()) {
                        for (int key : result.get(k).keySet()) {
                            // 더하기
                            if (key + key2 > 0)
                                result.get(i).put(key + key2, "(" + result.get(j).get(key) + "+" + result.get(k).get(key2) + ")");
                            // 빼기
                            if (key - key2 > 0)
                                result.get(i).put(key - key2, "(" + result.get(j).get(key) + "-" + result.get(k).get(key2) + ")");
                            // 곱하기
                            if (key * key2 > 0)
                                result.get(i).put(key * key2, "(" + result.get(j).get(key) + "*" + result.get(k).get(key2) + ")");
                            // 나누기
                            if (key / key2 > 0)
                                result.get(i).put(key / key2, "(" + result.get(j).get(key) + "/" + result.get(k).get(key2) + ")");
                        }
                    }
                }
            }
                if (result.get(i).containsKey(number)) {
                    answer = i;
                    break;
                }
        }

        if (answer<=8&&answer>=1) {
            return answer;
        } else
            return -1;

    }
}