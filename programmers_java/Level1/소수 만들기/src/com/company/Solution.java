package com.company;

import java.util.Arrays;

public class Solution {
    boolean[] prime = new boolean[3000];
    public int count = 0;

    public void DFS(int[] nums, int current, int threeCnt, int size) {
        if (threeCnt == 3 && prime[size] == false) {
            count++;
        }
        else if(current==nums.length||threeCnt>3)
        {
            return;
        }
        else{
            DFS(nums, current + 1, threeCnt + 1, size + nums[current]);
            DFS(nums, current + 1, threeCnt, size);
        }

    }

    public int solution(int[] nums) {
        for (int i = 2; i <= Math.sqrt(2997); i++) {
            for (int j = i; j <= 2997 / i; j++) {
                prime[i * j] = true;
            }
        }

        DFS(nums, 0, 0, 0);

        System.out.println(count);

        return count;
    }
}
