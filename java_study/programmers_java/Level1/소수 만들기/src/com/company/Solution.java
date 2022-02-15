package com.company;

import java.util.Arrays;

public class Solution {

    public int count = 0;

    public void DFS(int[] nums, int current, int threeCnt, int size, boolean[] prime) {
        if (threeCnt == 3 && prime[size] == false) {
            count++;
        } else if (current < nums.length) {
            DFS(nums, current + 1, threeCnt + 1, size + nums[current], prime);
            DFS(nums, current + 1, threeCnt, size, prime);
        }

    }

    public int solution(int[] nums) {
        Arrays.sort(nums);
        int maxNum = 1000+999+998;

        boolean[] prime = new boolean[maxNum + 1];

        for (int i = 2; i <= Math.sqrt(maxNum); i++) {
            for (int j = i; j <= maxNum / i; j++) {
                prime[i * j] = true;
            }
        }

        DFS(nums, 0, 0, 0, prime);

        System.out.println(count);

        return count;
    }
}
