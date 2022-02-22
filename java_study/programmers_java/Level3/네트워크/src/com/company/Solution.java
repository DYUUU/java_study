package com.company;


import java.util.HashSet;

public class Solution {
    public HashSet<Integer> visit;
    public HashSet<Integer> network = new HashSet<>();

    public void findNetwork(int current,String[] arr) {
        for (int i = 0; i < arr[current].length(); i++) {
            int tmp = Integer.parseInt(String.valueOf(arr[current].charAt(i)));
            if (!visit.contains(tmp)) {
                visit.add(tmp);
                findNetwork(tmp, arr);
            }
        }
    }

    public int solution(int n, int[][] computers) {
        visit = new HashSet<>();
        String[] arr = new String[n];
        String str = "";


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (computers[i][j] == 1)
                    str += j;
            }
            arr[i]=(str);
            str = "";
        }

        for (int i = 0; i < n; i++) {
            if (!visit.contains(i)) {
                findNetwork(i, arr);
                network.add(i);
            }
        }

        System.out.println(network);
        return network.size();
    }

}