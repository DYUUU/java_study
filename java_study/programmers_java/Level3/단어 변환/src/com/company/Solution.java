package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean[] wordsCheck;

    public void findMinProgress(String str, String prog, String target, ArrayList<String> words, int beginIndex) {
        if (str.equals(target)) {
            System.out.println(prog);
        } else {
            for (int i = 0; i < words.size(); i++) {
                if(beginIndex==str.length())
                {
                    return;
                }
                if (!wordsCheck[i]) {
                    String tmp = str.substring(0, beginIndex) + str.substring(beginIndex + 1, str.length());
                    String word = words.get(i).substring(0, beginIndex) + words.get(i).substring(beginIndex + 1, str.length());
                    if (tmp.equals(word)) {
                            wordsCheck[i] = true;
                        prog += words.get(i) + " ";
                        findMinProgress(words.get(i), prog, target, words, 0);
                    }
                    else
                    {
                        findMinProgress(str, prog, target, words, beginIndex+1);
                    }
                }
            }
        }
    }

    public int solution(String begin, String target, String[] words) {
        wordsCheck = new boolean[words.length];
        ArrayList<String> arr = new ArrayList<String>(List.of(words));

        if (!arr.contains(target)) {
            return 0;
        } else {
                findMinProgress(begin, begin + " ", target, arr, 0);
            return 1;
        }

    }
}
