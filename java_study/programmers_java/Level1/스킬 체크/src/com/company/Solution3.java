package com.company;

public class Solution3 {
    public char[] keyPad={'?','L','?','R','L','?','R','L','?','R'};
    public int[][] distint ={{0,999,3,999,999,2,999,999,1,999},
            {4,999,1,999,999,2,999,999,4,999},
            {3,999,0,999,999,1,999,999,2,999},
            {4,999,1,999,999,2,999,999,3,999},
            {3,999,2,999,999,1,999,999,2,999},
            {2,999,1,999,999,0,999,999,1,999},
            {3,999,2,999,999,1,999,999,2,999},
            {2,999,3,999,999,2,999,999,1,999},
            {1,999,2,999,999,1,999,999,0,999},
            {2,999,3,999,999,2,999,999,1,999},
            {1,999,4,999,999,3,999,999,2,999},
            {1,999,4,999,999,3,999,999,2,999}};
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftHand = 10;
        int rightHand = 11;
        for(int i=0;i<numbers.length;i++){
            switch (keyPad[numbers[i]]){
                case 'L':
                    answer+='L';
                    leftHand=numbers[i];
                    break;
                case 'R':
                    answer+='R';
                    rightHand=numbers[i];
                    break;
                case '?':
                    if(distint[rightHand][numbers[i]]>distint[leftHand][numbers[i]]){
                        leftHand=numbers[i];
                        answer+="L";
                    }else if(distint[rightHand][numbers[i]]>distint[leftHand][numbers[i]]){
                        rightHand=numbers[i];
                        answer+="R";
                    }else{
                        if(hand.charAt(0)=='r'){
                            rightHand=numbers[i];
                            answer+="R";
                        }
                        else{
                            leftHand=numbers[i];
                            answer+="L";
                        }
                    }

            }
        }
        return answer;
    }
}
