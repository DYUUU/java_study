package com.company;


import java.util.ArrayList;
import java.util.Comparator;

public class Solution2 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            str.add(strings[i]);
        }

        str.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n)==o2.charAt(n)){
                    return o1.compareTo(o2);
                }
                return o1.charAt(n)-o2.charAt(n);
            }
        });

        for(int i=0;i<str.size();i++){
            answer[i]=str.get(i);
        }
        System.out.println(str);

        return answer;
    }
}
