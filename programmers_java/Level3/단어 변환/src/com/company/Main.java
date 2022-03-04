package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String begin = "hit";
        String target = "cog";

        String[] words1= {
                "hot","dot","dog","lot","log","cog"
        };

        String[] words2= {
                "hot","dot","dog","lot","log"
        };

        Solution sol = new Solution();
        sol.solution(begin,target,words1);
        sol.solution(begin,target,words2);
    }
}
