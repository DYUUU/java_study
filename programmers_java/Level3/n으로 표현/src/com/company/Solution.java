package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public int solution(int N, int number) {
        ArrayList<HashMap<Integer, String>> result = new ArrayList<>();
        String strN = Integer.toString(N);
        int answer = 0;

        result.add(new HashMap<Integer, String>());
        result.get(0).put(Integer.valueOf(strN), strN);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < (result.size()) / 2; j++) {
                for (int k = result.size() - 2; k >= (result.size() / 2) - 1; k--, j++) {
                    for (int key : result.get(k).keySet()) {
                        for (int key2 : result.get(j).keySet()) {
                            // 더하기
                            if (key + key2 > 0)
                                result.get(i).put(key + key2, "(" + result.get(j).get(key2) + "+" + result.get(k).get(key) + ")");
                            // 빼기
                            if (key - key2 > 0)
                                result.get(i).put(key - key2, "(" + result.get(j).get(key2) + "-" + result.get(k).get(key) + ")");
                            // 곱하기
                            if (key * key2 > 0)
                                result.get(i).put(key * key2, "(" + result.get(j).get(key2) + "*" + result.get(k).get(key) + ")");
                            // 나누기
                            if (key / key2 > 0)
                                result.get(i).put(key / key2, "(" + result.get(j).get(key2) + "/" + result.get(k).get(key) + ")");
                        }
                    }
                }
            }
            if (result.get(i).containsKey(number)) {
                answer = i + 1;
                break;
            }
            result.add(new HashMap<Integer, String>());
            strN += N;
            result.get(i + 1).put(Integer.valueOf(strN), strN);
        }

        if (answer <= 8 && answer >= 1) {
            return answer;
        } else
            return -1;

    }
}