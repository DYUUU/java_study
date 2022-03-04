package com.company;

public class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            for(int j = i ; j <n;j++){
                sum+=j;
                if(sum>n){
                    break;
                }
                else if(sum==n) {
                    answer++;
                    break;
                }
            }
            sum=0;
        }

        System.out.println(answer);

        return answer;
    }
}
