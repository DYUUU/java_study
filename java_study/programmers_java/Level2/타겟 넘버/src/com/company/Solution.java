package com.company;

class Solution {
    public int[] copyNumbers;
    public int copyTarget;
    public int count;
    public int cnt = 0;

    public void DFS(int size, int current) {
        cnt++;
        if (current == copyNumbers.length - 1) {
            if (copyTarget == size) {
                count += 1;
            }
        } else {
            DFS(size + copyNumbers[current], current + 1);
            DFS(size - copyNumbers[current], current + 1);
        }
    }

    public int solution(int[] numbers, int target) {
        copyNumbers = numbers.clone();
        copyTarget = target;

        DFS(0, 0);
        System.out.println(count);
        System.out.println(cnt);
        return count;
    }
}