package com.company;


import java.util.HashSet;

class Solution {
    public boolean[] prime = new boolean[100000001];
    public HashSet<Integer> intHashSet = new HashSet<Integer>();
    boolean visit[];

    public void DFS(String src, String makePrime, int current) {
        if (current == src.length()) {
            if (makePrime.equals("")) return;
            else {
                int num = Integer.valueOf(makePrime);
                if (!prime[num]) {
                    intHashSet.add(num);
                }
            }
        } else {
            for (int i = 0; i < src.length(); i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    DFS(src, makePrime + src.charAt(i), current + 1);
                    DFS(src, makePrime, current + 1);
                    visit[i] = false;
                }
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
        visit = new boolean[numbers.length()];
        DFS(numbers, "", 0);

        System.out.println(intHashSet.toString());

        return intHashSet.size();
    }
}
