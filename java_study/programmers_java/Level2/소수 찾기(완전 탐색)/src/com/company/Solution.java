package com.company;

import java.util.HashSet;

class Solution {
    public boolean[] prime = new boolean[100000001];
    public HashSet<Integer> intHasset = new HashSet<Integer>();
    public int index = 0;

    public void DFS(String num, String primeNum, int current) {
        if (current == num.length()) {
            if (primeNum.length() > 0 && !prime[Integer.valueOf(primeNum)])
                intHasset.add(Integer.valueOf(primeNum));
            else if (index < num.length()) {
                index++;
                if (index == num.length())
                    return;
                else
                    DFS(num, String.valueOf(num.charAt(index)), 0);
            }
        } else {
            if (index > 0 && index == current)
                DFS(num, primeNum, current + 1);
            else {
                DFS(num, primeNum + num.charAt(current), current + 1);
                DFS(num, primeNum, current + 1);
            }
        }
    }

    public void getPrime(boolean[] prime) {
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(10000000); i++) {
            for (int j = i; j <= 10000000 / i; j++)
                prime[i * j] = true;
        }
    }

    public int solution(String numbers) {
        getPrime(prime);

        DFS(numbers, "", 0);

        System.out.println(intHasset.toString());

        return intHasset.size();
    }
}