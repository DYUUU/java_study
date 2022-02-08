package com.company;

public class Solution1 {
    public int solution(int n) {
        int answer = 0;
        if(n==0)
            return 0;
        else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    answer += i;
            }
            System.out.println(answer);
            return answer;
        }
    }
}
