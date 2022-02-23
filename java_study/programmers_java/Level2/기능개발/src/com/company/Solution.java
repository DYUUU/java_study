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
        for (int i = 0; i <= len; i++) {
            progressQueue.add(progresses[i]);
        }

        while (true) {
            for (int i = num; i < progressQueue.size(); i++) {
                progressQueue.add(progressQueue.peek() + speeds[i]);
                progressQueue.remove();
            }

            while (progressQueue.size()>0&&progressQueue.peek() >= 100) {
                progressQueue.remove();
                num++;
            }

            if (num != 0) {
                answer.add(num);
                num = 0;
            }
            if (progressQueue.size() == 0)
                break;
        }

        System.out.println(answer);

        return answer.toArray(new Integer[0]);

    }
}
