package com.company;


import java.util.HashSet;

public class Solution {
    public boolean[] visit;
    public HashSet<Integer> network = new HashSet<>();

    public void findNetwork(int current, int[][] computers) {
        for (int i = 0; i < computers[current].length; i++) {
            if (!visit[i]) {
                if (computers[current][i] == 1) {
                    visit[i] = true;
                    findNetwork(i, computers);
                }
            }
        }
    }

    public int solution(int n, int[][] computers) {
        visit = new boolean[200];

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                findNetwork(i, computers);
                network.add(i);
            }
        }

        System.out.println(network);
        return network.size();
    }

}