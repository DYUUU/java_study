package com.company;


import java.util.HashSet;

public class Solution {
    public boolean[] visit;
    public HashSet<Integer> network = new HashSet<>();

    public void findNetwork(int current, String[] arr) {
        for (int i = 0; i < arr[current].length(); i++) {
            int tmp = Integer.valueOf(String.valueOf(arr[current].charAt(i)));
            if (!visit[tmp]) {
                visit[tmp] = true;
                findNetwork(tmp, arr);
            }
        }
    }

    public int solution(int n, int[][] computers) {
        visit = new boolean[200];
        String[] arr = new String[n];
        String str = "";


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (computers[i][j] == 1)
                    str += j;
            }
            arr[i] = (str);
            str = "";
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                findNetwork(i, arr);
                network.add(i);
            }
        }

        System.out.println(network);
        return network.size();
    }

}