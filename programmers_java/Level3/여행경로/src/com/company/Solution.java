package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public String[] answer;
    public HashSet<String> airports = new HashSet<>();

    public void route(String str, String src, String[][] tickets, HashMap<String, Integer> ticketMap) {
        /* 모든 티켓 소진 시 return */
        String[] tmp = (str.split(" "));
        if (tmp.length == tickets.length+1) {
            if (answer[0] != (null)) {
                for (int i = 0; i < tickets.length; i++) {
                    // 경로가 여러 개일 경우 알파벳 순으로 변경
                    if (tmp[i].compareTo(answer[i]) < 0) {
                        answer = tmp.clone();
                        break;
                    } else if (tmp[i].compareTo(answer[i]) > 0) {
                        break;
                    }
                }
            } else {
                answer = tmp.clone();
            }
        } else {
            for (String dst : airports) {
                /* 출발지가 일치하는 티켓 확인 후 도착지 -> 출발지로 변경 */
                if (!src.equals(dst)) {
                    String key = Arrays.toString(new String[]{src, dst});
                    if (ticketMap.containsKey(key)) {
                        if (ticketMap.get(key) > 0) {
                            ticketMap.put(key, ticketMap.get(key) - 1);
                            route(str + " " + dst, dst, tickets, ticketMap);
                            ticketMap.put(key, ticketMap.get(key) + 1);
                        }
                    }
                }
            }
        }
    }


    public String[] solution(String[][] tickets) {
        HashMap<String, Integer> ticketsMap = new HashMap<>();
        answer = new String[tickets.length];

        // 공항 리스트 인출
        for (int i = 0; i < tickets.length; i++) {
            airports.add(tickets[i][0]);
            airports.add(tickets[i][1]);
        }

        // 티켓 개수 세기
        for (int i = 0; i < tickets.length; i++) {
            String airport = Arrays.toString(tickets[i]);
            if (ticketsMap.containsKey(airport))
                ticketsMap.put(airport, ticketsMap.get(airport) + 1);
            else
                ticketsMap.put(airport, 1);
        }

        route("ICN", "ICN", tickets, ticketsMap);

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}

