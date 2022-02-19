package com.company;


import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> visit;
    public ArrayList<Integer> network = new ArrayList<>();
    public boolean flag = false;

    public void DFS(int n, int current, ArrayList<String> arr) {
        if (current == n) {
            return;
        } else {
            for (int j = 0; j < arr.get(current).length(); j++) {
                int tmpNum = Integer.parseInt(String.valueOf(arr.get(current).charAt(j)));
                if (!visit.contains(tmpNum)) {
                    char[] ch = arr.get(current).toCharArray();
                    visit.add(tmpNum);
                    if (j == 0 && !flag) {
                        network.add(tmpNum);
                    }
                    flag = false;
                }
                if (j == arr.get(current).length() - 1) {
                    DFS(n, current + 1, arr);
                }
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
        DFS(n, 0, arr);

        System.out.println(network);
        return network.size();
    }

}