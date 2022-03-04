package com.company;

public class Solution3 {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        int index=0;
        for(long i=left;i<=right;i++){
            long x= i/n;
            long y=i%n;

            long num=Math.max(x,y)+1;
            answer[index++]=(int)num;
        }
        return answer;
    }
}
