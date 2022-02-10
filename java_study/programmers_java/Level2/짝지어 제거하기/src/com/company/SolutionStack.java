package com.company;

import java.util.Arrays;
import java.util.Stack;

public class SolutionStack {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        if (stack.size() % 2 != 0)
            return 0;
        else {
            for (int j = 0; j < s.length(); j++) {
                if (!stack.isEmpty()) {
                    sb.append(stack.pop());
                    if (sb.length() > 1) {
                        if (sb.charAt(sb.length() - 2) == sb.charAt(sb.length() - 1))
                            sb.delete(sb.length() - 2, sb.length());
                    } else if (sb.charAt(sb.length() - 1) == stack.peek()) {
                        sb.append(stack.pop());
                        sb.delete(sb.length() - 2, sb.length());
                    }
                } else
                    break;
            }
        }

        if (sb.length() == 0)
            return 1;
        else
            return 0;
    }
}
