package com.company;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public boolean[] wordsCheck;
    public HashSet<String> result = new HashSet<>();

    public void findMinProgress(String str, String prog, String target, ArrayList<String> words, int beginIndex) {
        if (str.equals(target)) {
            System.out.println(prog);
        } else {
            if (beginIndex == str.length()) {
                return;
            } else {
                if (!wordsCheck[beginIndex]) {

                    /* 타겟 값이랑 일치하는 값이 있는지 확인 */
                    for (int i = 0; i < str.length(); i++) {
                        String mix = str.substring(0, i) + target.charAt(i) + str.substring(i + 1, str.length());

                        if (words.contains(mix)) {
                            result.add(mix);
                            wordsCheck[i] = true;
                            words.remove(mix);
                            findMinProgress(mix, prog + mix + " ", target, words, 0);
                        }
                    }

                    for (int i = 0; i < words.size(); i++) {
                        String tmp = str.substring(0, beginIndex) + str.substring(beginIndex + 1, str.length());
                        String word = words.get(i).substring(0, beginIndex) + words.get(i).substring(beginIndex + 1, words.get(i).length());
                        if (tmp.equals(word)) {
                            result.add(str);
                            str = words.get(i);
                            words.remove(i);
                            findMinProgress(str, prog + str + " ", target, words, 0);
                        }
                    }
                }
            }
            findMinProgress(str, prog, target, words, beginIndex + 1);
        }
    }

    public int solution(String begin, String target, String[] words) {
        wordsCheck = new boolean[begin.length()];
        ArrayList<String> arr = new ArrayList<String>(List.of(words));

        if (!arr.contains(target)) {
            return 0;
        } else {
            for (int i = 0; i < begin.length(); i++) {
                findMinProgress(begin, "", target, arr, i);
            }
            return result.size();
        }
    }
}