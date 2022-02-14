package com.company;


import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        Stack stack = new Stack();

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length; i++) {
            if (stack.isEmpty())
                stack.push(participant[i]);
            else if (stack.peek() == stack.push(completion[i-1])) {
                stack.pop();
                stack.pop();
            }
        }

        return String.valueOf(stack.peek());
    }
}