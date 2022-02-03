package com.company;

public class Solution {
    public String solution(String phone_number) {
        String code = "" ;
        int codeLenth = phone_number.length() - 4;

        for(int i = 0; i < codeLenth; i++)
            code += "*";

        String answer = code + phone_number.substring(codeLenth);

        return answer;
    }
}