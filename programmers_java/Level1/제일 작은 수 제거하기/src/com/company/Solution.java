package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1)
        {
            return new int[]{-1};
        }
        else
        {
            Integer min = Arrays.stream(arr).min().getAsInt();

            ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
            integerArray.removeAll(Arrays.asList(min));

            return integerArray.stream()
                    .mapToInt(i->i)
                    .toArray();
        }
    }
}