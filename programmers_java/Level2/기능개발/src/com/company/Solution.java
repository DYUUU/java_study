package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public Integer[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> progressQueue = new LinkedList<>();
        int len = progresses.length - 1;
        int num = 0;
        int index = 0;

        for (int i = 0; i <= len; i++) {
            progressQueue.add(progresses[i]);
        }

        while (progressQueue.size() != 0) {
            for (int i = index; i < progresses.length; i++) {
                progressQueue.add(progressQueue.peek() + speeds[i]);
                progressQueue.remove();
            }

            while (progressQueue.size()>0&&progressQueue.peek() >= 100) {
                progressQueue.remove();
                num++;
            }

            if (num != 0) {
                answer.add(num);
                index += num;
                num = 0;
            }
        }

        System.out.println(answer);

        return answer.toArray(new Integer[0]);

    }
}
