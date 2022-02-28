package com.company;

import java.util.HashMap;

public class Solution {

    public int solution(int N, int number) {
        HashMap<Integer, String> values = new HashMap<>();
        int answer = 0;
        String strN = Integer.toString(N);

        values.put(Integer.valueOf(strN), strN);

        while (!values.containsKey(number)) {
            values.put(Integer.valueOf(strN), strN);
            HashMap<Integer, String> tmpMap = (HashMap<Integer, String>) values.clone();

            for (int i : tmpMap.keySet()) {
                for (int j : tmpMap.keySet()) {
                    String str = values.get(i) + " ? " + values.get(j);
                    // 더하기
                    if (i + j <= N * number) {
                        if (!tmpMap.containsKey(i + j)) {
                            values.put(i + j, values.get(i) + " + " + values.get(j));
                        } else {
                            if (str.length() < tmpMap.get(i + j).length()) {
                                values.put(i + j, values.get(i) + " + " + values.get(j));
                            }
                        }
                    }
                    // 빼기
                    if (i - j <= N * number && 0 < i - j) {
                        if (!tmpMap.containsKey(i - j)) {
                            values.put(i - j, values.get(i) + " - " + values.get(j));
                        } else {
                            if (str.length() < tmpMap.get(i - j).length()) {
                                values.put(i - j, values.get(i) + " - " + values.get(j));
                            }
                        }
                    }
                    // 곱하기
                    if (i * j <= N * number) {
                        if (!tmpMap.containsKey(i * j)) {
                            values.put(i * j, values.get(i) + " * " + values.get(j));
                        } else {
                            if (str.length() < tmpMap.get(i * j).length()) {
                                values.put(i * j, values.get(i) + " * " + values.get(j));
                            }
                        }
                    }
                    // 나누기
                    if (i / j <= N * number && i / j > 0) {
                        if (!tmpMap.containsKey(i / j)) {
                            values.put(i / j, values.get(i) + " / " + values.get(j));
                        } else {
                            if (str.length() < tmpMap.get(i / j).length()) {
                                values.put(i / j, values.get(i) + " / " + values.get(j));
                            }
                        }
                    }
                }
            }
            if (number* number >= Integer.valueOf(strN + N)) strN += N;
        }

        for (char ch : values.get(number).toCharArray()) {
            if ((int) ch - '0' == N)
                answer++;
        }

        if (answer < 9)
            return answer;
        else
            return -1;

    }
}