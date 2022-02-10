package com.company;

import java.util.Arrays;

public class Solution {
    public int solution(int[] arr) {

        int lcm = 1;

        if(arr.length==1)
            return arr[0];
        else{
            lcm = getLcm(arr[0],arr[1]);
            for(int i = 2; i < arr.length;i++)
            {
                lcm = getLcm(lcm,arr[i]);
            }
        }

        System.out.println(lcm);

        return lcm;
    }

    public int getLcm(int lcm, int num) {
        int gcd = 1;
        int min = Math.min(lcm, num);

        for (int i = 1; i <= min; i++) {
            if (lcm % i == 0 && num % i == 0) {
                gcd *= i;
                num /= i;
                lcm /= i;
                i = 1;
                min /= i;
            }
        }

        lcm *= gcd * num;

        return lcm;
    }
}

