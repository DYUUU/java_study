package com.company;

public class Solution2 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 0;
        int right = 0;
        for(int i = 0; i <numbers.length;i++)
        {
            if( numbers[i] == 1 ||
                numbers[i] == 4 ||
                numbers[i] == 7)
            {
                answer+="L";
                left = numbers[i];
            }
            else if(numbers[i] == 3 ||
                    numbers[i] == 6 ||
                    numbers[i] == 9)
            {
                answer+="R";
                right = numbers[i];
            }
            else if(numbers[i] == 2 ||
                    numbers[i] == 5 ||
                    numbers[i] == 8 ||
                    numbers[i] == 0)
            {

                int leftabs = Math.abs(numbers[i]-left);
                int rightabs = Math.abs(numbers[i]-right);
                if(leftabs>rightabs)
                {
                    answer+="R";
                    right=numbers[i];
                }
                if(leftabs<rightabs)
                {
                    answer+="L";
                    left=numbers[i];
                }
                if(leftabs==rightabs)
                {
                    if(hand.equals("right"))
                    {
                        answer+="R";
                        right=numbers[i];
                    }
                    else if(hand.equals("left"))
                    {
                        answer+="L";
                        left=numbers[i];
                    }
                }

            }
        }
        System.out.println(answer);
        return answer;
    }
}
