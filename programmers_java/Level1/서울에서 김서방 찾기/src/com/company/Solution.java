package com.company;

import java.util.Arrays;

public class Solution {
    public String solution(String[] seoul) {
        return "김서방은 " + String.valueOf(Arrays.asList(seoul).indexOf("Kim"))+"에 있다";
    }
}
