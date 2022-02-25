package com.company;


import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public String[] answer;

    public void route(String str, String src, String[][] tickets, HashMap<String, Integer> airports) {
        /* 모든 티켓 소진 시 return */
        if (!airports.containsValue(1)) {
            String[] tmp = (str.split(" "));
            if (answer[0] != (null)) {
                for (int i = 0; i < tickets.length; i++) {
                    if (tmp[i].compareTo(answer[i]) < 0) {
                        answer = tmp.clone();
                        break;
                    } else if (tmp[i].compareTo(answer[i]) > 0) {
                        break;
                    }
                }
            }else {
                answer = tmp.clone();
            }
        }else {
            for (int i = 0; i < tickets.length; i++) {
                /* 출발지가 일치하는 티켓 확인 후 도착지 -> 출발지로 변경 */
                String key = Arrays.toString(new String[]{src, tickets[i][1]});
                if (airports.containsKey(key)) {
                    if (airports.get(key) != 0) {
                        airports.put(key, 0);
                        route(str + " " + tickets[i][1], tickets[i][1], tickets, airports);
                        airports.put(key, airports.get(key) + 1);
                    }
                }
            }
        }

    }


    public String[] solution(String[][] tickets) {
        HashMap<String, Integer> airports = new HashMap<>();
        answer = new String[tickets.length];

        for (int i = 0; i < tickets.length; i++) {
            airports.put(Arrays.toString(tickets[i]), 1);
        }

        route("ICN", "ICN", tickets, airports);

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
