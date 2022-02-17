package com.company;
import java.util.HashSet;

class Solution {
    public boolean[] prime = new boolean[100000001];
    public HashSet<Integer> intHasset = new HashSet<Integer>();
    int cnt;

    public void DFS(String src, String makePrime, int current, int check) {
        if (current == src.length() || makePrime.length() == src.length()) {
            if (!makePrime.equals("")) {
                int makePrimeToInt = Integer.valueOf(makePrime);
                if (!prime[makePrimeToInt])
                    intHasset.add(makePrimeToInt);
            }
            if (makePrime.length() < src.length()) {
                int tmpCheck = check + 1;
                if (tmpCheck == src.length()) {
                    DFS(src, makePrime + src.charAt(0), 0, 0);
                } else {
                    DFS(src, makePrime + src.charAt(tmpCheck), check + 1, tmpCheck);
                }
            }


        } else {
            DFS(src, makePrime + src.charAt(current), current + 1, current);
            DFS(src, makePrime, current + 1, check);

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

        DFS(numbers, "", 0, 0);

        System.out.println(intHasset.toString());

        return intHasset.size();
    }
}
