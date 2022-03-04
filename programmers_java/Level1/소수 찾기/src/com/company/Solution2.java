package com.company;


import java.util.ArrayList;

class Solution2 {
    public int solution(int n) {
        boolean[] numbers = new boolean[1000001];

        numbers[0]=true;
        numbers[1]=true;

        for(int i=2;i<1001;i++){
            boolean flag =true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                for(int j=i+i;j<1000001;j+=i)
                    numbers[j]=true;
            }
        }

        int answer =0;
        for(int i=0;i<=n;i++){
            if(!numbers[i]) answer++;
        }


        return answer++;
    }
}