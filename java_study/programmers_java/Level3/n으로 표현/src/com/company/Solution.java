package com.company;

import java.util.HashMap;

public class Solution {

    public int solution(int N, int number) {
        HashMap<Integer, String> values = new HashMap<>();
        int answer = 0;
        String strN = Integer.toString(N);

        values.put(Integer.valueOf(strN), strN);

        while (true) {
            values.put(Integer.valueOf(strN), strN);
            HashMap<Integer, String> tmpMap = (HashMap<Integer, String>) values.clone();

            for (int i : tmpMap.keySet()) {
                for (int j : tmpMap.keySet()) {
                    String str = values.get(i) + " ? " + values.get(j);
                    // 더하기
                    if (i + j <= number) {
                        if (!tmpMap.containsKey(i + j)) {
                            values.put(i + j, "("+values.get(i) + " + " + values.get(j)+")");
                        } else {
                            if (str.length() < tmpMap.get(i + j).length()) {
                                values.put(i + j, "("+values.get(i) + " + " + values.get(j)+")");
                            }
                        }
                    }
                    // 빼기
                    if (i - j <= number && 0 < i - j) {
                        if (!tmpMap.containsKey(i - j)) {
                            values.put(i - j, "("+values.get(i) + " - " + values.get(j)+")");
                        } else {
                            if (str.length() < tmpMap.get(i - j).length()) {
                                values.put(i - j, "("+values.get(i) + " - " + values.get(j)+")");
                            }
                        }
                    }
                    // 곱하기
                    if (i * j <=number) {
                        if (!tmpMap.containsKey(i * j)) {
                            values.put(i * j,"("+ values.get(i) + " * " + values.get(j)+")");
                        } else {
                            if (str.length() < tmpMap.get(i * j).length()) {
                                values.put(i * j, "("+values.get(i) + " * " + values.get(j)+")");
                            }
                        }
                    }
                    // 나누기
                    if (i / j <= N * number && i / j > 0) {
                        if (!tmpMap.containsKey(i / j)) {
                            values.put(i / j, "("+values.get(i) + " / " + values.get(j)+")");
                        } else {
                            if (str.length() < tmpMap.get(i / j).length()) {
                                values.put(i / j, "("+values.get(i) + " / " + values.get(j)+")");
                            }
                        }
                    }
                }
            }
            System.out.println(values.get(number));
            if(10*number>Integer.valueOf(strN+N))strN += N;
            if (values.containsKey(number)) {
                if (values.get(number).length() - values.get(number).replaceAll(String.valueOf(N), "").length() <= 8) {
                    break;
                }
            }
        }

        System.out.println(values.get(number));
        for (char ch : values.get(number).toCharArray()) {
            if ((int) ch - '0' == N)
                answer++;
        }

        System.out.println(values.get(number));

        if (answer < 9)
            return answer;
        else
            return -1;

    }
}