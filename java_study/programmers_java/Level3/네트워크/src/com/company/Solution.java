package com.company;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Solution {
    public int solution(int n, int[][] computers) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();


        for (int i = 0; i < n; i++) {
            String str = "";
            for (int j = 0; j < n; j++) {
                str += computers[i][j];
            }
            hashSet.add(str);
        }

        for (int i = 0; i < n; i++) {
            for (String key : hashSet) {
                String tmp = key;
                String reverseTmp = "";
                char[] ch = tmp.toCharArray();
                for (int j = ch.length - 1; j >= 0; j--) {
                    reverseTmp += ch[j];
                }
                if (hashSet.contains(reverseTmp)&&!tmp.equals(reverseTmp)) {
                    hashSet.remove(tmp);
                    hashSet.remove(reverseTmp);
                    break;
                }
            }
        }

        System.out.println(hashSet);

        return hashSet.size();
    }
}
