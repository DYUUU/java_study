package com.company;

class Solution {
    public int[] copyNumbers;
    public int copyTarget;
    public int count;

    public void DFS(int size, int current) {
        if (current == copyNumbers.length) {
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
        return count;
    }
}