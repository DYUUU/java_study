package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        for(int i : arr)
            if(i%divisor==0)
                integerArrayList.add(i);

        if(integerArrayList.size()==0)
        {
            return new int[]{-1};
        }
        else{
        answer =  integerArrayList.stream()
                .mapToInt(i->i)
                .toArray();
        Arrays.sort(answer);

        return answer;
        }
    }
}
