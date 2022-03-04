package com.company;

public class Solution2 {
    public int solution(int[] nums) {
        int answer = 0;
        int divisor = 0;
        int flag = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    divisor = nums[i] + nums[j] + nums[k];

                    for (int x = 2; x < divisor; x++) {
                        if (divisor % x == 0) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0)
                        answer++;
                    else
                        flag = 0;
                }
            }
        }
        return answer;
    }
}
