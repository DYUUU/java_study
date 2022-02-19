package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;

public class Solution {
    public ArrayList<String> arr;
    public boolean[] visit;
    public ArrayList<Integer> network = new ArrayList<>();

    public void DFS(int n, int current) {
        if (current == n) {
            return;
        } else {
            for (int j = 0; j < arr.get(current).length(); j++) {
                int tmpNum = Integer.parseInt(String.valueOf(arr.get(current).charAt(j)));
                if (!visit[tmpNum]) {
                    visit[tmpNum]=true;
                    if (j==0) {
                        network.add(tmpNum);
                    }
                }
                if (j == arr.get(current).length() - 1) {
                    DFS(n, current + 1);
                }
            }
        }
    }

    public int solution(int n, int[][] computers) {
        visit  = new boolean[201];
        visit[0]=true;
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
        DFS(n, 0);

        System.out.println(network);
        return network.size();
    }

}