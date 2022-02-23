package com.company;


import java.util.ArrayList;

public class Solution2 {
    public boolean[] releaseCheck;

    public Integer[] solution(int[] progresses, int[] speeds) {
        int len = progresses.length - 1;
        ArrayList<Integer> answer = new ArrayList<>();
        boolean flag = false;
        releaseCheck = new boolean[len];
        int index= 0;

        for (int i = 0; progresses[len] <= 100; i++) {
            for (int j = 0; j < len; j++) {
                if (progresses[j] >= 100) {
                    releaseCheck[j] = true;
                    for (int k = index; k < j; k++) {
                        if (!releaseCheck[k])
                            flag = true;
                    }
                    if (!flag) {
                        index = j;
                        answer.add(index);
                    }
                }
                else {
                    progresses[j] += speeds[j];
                }
            }
        }

        System.out.println(answer);

        return answer.toArray(new Integer[0]);
    }
}
