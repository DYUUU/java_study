package com.company;


import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public ArrayList<Integer> visit;
    public HashSet<Integer> network = new HashSet<>();

    public void findNetwork(int current, ArrayList<String> arr) {
        for (int i = 0; i < arr.get(current).length(); i++) {
            int tmp = Integer.valueOf(String.valueOf(arr.get(current).charAt(i)));
            if (!visit.contains(tmp)) {
                visit.add(tmp);
                findNetwork(i, arr);
            }
        }
    }

    public int solution(int n, int[][] computers) {
        visit = new ArrayList<>();
        ArrayList<String> arr = new ArrayList<>();
        String str = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (computers[i][j] == 1)
                    str += j + 1;
            }
            arr.add(str);
            str = "";
        }

        for (int i = 0; i < n; i++) {
            if (!visit.contains(i + 1)) {
                findNetwork(i, arr);
                network.add(i + 1);
            }
        }

        System.out.println(network);
        return network.size();
    }

}