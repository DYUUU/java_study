package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public int currentNum = 0;
    public int count = 0;

    public void BFS(int[] nums, int current, int threeCnt, int size, boolean[] prime) {
        if (threeCnt == 3 && prime[size] == false) {
            if(current<=nums.length)
               count++;
        } else if (current < nums.length) {
            BFS(nums, current + 1, threeCnt + 1, size + nums[current], prime);
            BFS(nums, current + 2, threeCnt + 1, size + nums[current], prime);
        } else if (current == nums.length) {
            currentNum += 1;
            BFS(nums, currentNum, 0, 0, prime);
        }

    }

    public int solution(int[] nums) {
        Arrays.sort(nums);
        int maxNum = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
        boolean[] prime = new boolean[maxNum + 1];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(maxNum); i++) {
            for (int j = i; j <= maxNum / i; j++) {
                prime[i * j] = true;
            }
        }

        BFS(nums, currentNum, 0, 0, prime);

        System.out.println(count);

        return count;
    }
}
