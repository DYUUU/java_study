package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> userInfo = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < record.length; i++) {
            String[] tmp = record[i].split(" ");
            if (tmp[0].equals("Enter")) {
                userInfo.put(tmp[1], tmp[2]);
                result.add(tmp[1] + "님이 들어왔습니다.");
            } else if (tmp[0].equals("Change")) {
                userInfo.put(tmp[1], tmp[2]);
            } else if (tmp[0].equals("Leave")) {
                result.add(tmp[1] + "님이 나갔습니다.");
            }
        }

        for (int i = 0; i < result.size(); i++) {
            int index = result.get(i).indexOf("님");
            String id = result.get(i).substring(0, index);
            result.set(i, result.get(i).replace(id, userInfo.get(id)));
        }

        System.out.println(result);

        return result.toArray(new String[0]);
    }
}
