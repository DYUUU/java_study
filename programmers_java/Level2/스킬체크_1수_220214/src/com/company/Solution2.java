package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
    public int[] solution(int n, long left, long right) {
        int length = (int) right - (int) left + 1;
        int[] answer = new int[length];
        int[] tmp = new int[n * n];

        System.out.println(Arrays.toString(getArr(n, n, tmp)));

        return answer;
    }

    public int[] getArr(int i, int n, int[] arr) {
        if(i==0)
            return arr;
        else if (n > i)
            arr[i] = i % n + 1;
        else
            arr[i] = arr[i % n];

        return getArr(i - 1, n, arr);
    }
}
