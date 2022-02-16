package com.company;

import java.util.HashSet;

class Solution {
    public boolean[] prime = new boolean[1001];
    HashSet<Integer> intHasset = new HashSet<Integer>();

    public void DFS(String num, String primeNum, int current) {
        if (!primeNum.equals("") && Integer.valueOf(primeNum) > 1) {
            if (!prime[Integer.valueOf(primeNum)])
                intHasset.add(Integer.valueOf(primeNum));
        }
        else if(current == num.length())
            return;
        else {
                DFS(num, primeNum + num.charAt(current), current + 1);
                DFS(num, primeNum, current + 1);

        }
    }

    public void getPrime(boolean[] prime) {
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(1000); i++) {
            for (int j = i; j <= 1000 / i; j++)
                prime[i * j] = true;
        }
    }

    public int solution(String numbers) {
        getPrime(prime);

        DFS(numbers, "", 0);

        return intHasset.size();
    }
}