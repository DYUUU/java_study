package com.company;


import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public ArrayList<String> arr;
    HashSet<Integer> visit = new HashSet<>();
    HashSet<Integer> network = new HashSet<>();

    public void DFS(int n, int index, int current) {
        if (current == n) {
            return;
        } else {
            for (int j = 0; j < arr.get(current).length(); j++) {
                int tmpNum = Integer.parseInt(String.valueOf(arr.get(current).charAt(j)))+1;
                if (!visit.contains(tmpNum)) {
                    visit.add(tmpNum);
                    if (j==0) {
                        index = Integer.parseInt(String.valueOf(arr.get(current).charAt(0)));
                        network.add(index);
                    }
                }
                if (j == arr.get(current).length() - 1) {
                    DFS(n, index, current + 1);
                }
            }
        }
    }

    public int solution(int n, int[][] computers) {
        arr = new ArrayList<>();
        String str = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (computers[i][j] == 1)
                    str += j + 1;
            }
            arr.add(String.valueOf(str));
            str = "";
        }
        DFS(n, 1, 0);

        System.out.println(network);
        return network.size();
    }

}