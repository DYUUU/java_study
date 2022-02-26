package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int route = 0;

    public void findOpenedPlace(int[][] maps, int x, int y, boolean[] isOpened,int count) {
        // 상
        if (x - 1 >= 0) {
            if (maps[x - 1][y] == 1||maps[x - 1][y]>count)
                isOpened[0] = true;
        }
        // 하
        if (x + 1 <= maps.length - 1) {
            if (maps[x + 1][y] == 1||maps[x + 1][y]>count)
                isOpened[1] = true;
        }
        // 좌
        if (y - 1 >= 0 ) {
            if (maps[x][y - 1] == 1||maps[x][y-1]>count)
                isOpened[2] = true;
        }
        // 우
        if (y + 1 <= maps.length - 1) {
            if (maps[x][y + 1] == 1||maps[x][y+1]>count)
                isOpened[3] = true;
        }
    }

    public int changeCoordinate(int[][] maps, int x, int y, boolean[] isOpened, int count) {

        // 모든 루트를 다 돌았을 때 실패
        if (count == route - 1) {
            return -1;
        }
        // 목적지에 도착헀다면 stop
        if (maps[maps.length - 1][maps.length - 1] == 0) {
            return count;
        } else {
            // 사방 탐색
            findOpenedPlace(maps, x, y, isOpened,count);
            // 상
            if (isOpened[0] == true) {
                x -= 1;
                maps[x][y] = ++count;
                changeCoordinate(maps, x, y, new boolean[4], count);
                --count;
                x += 1;
            }
            // 하
            if (isOpened[1] == true) {
                x += 1;
                maps[x][y] = ++count;
                changeCoordinate(maps, x, y, new boolean[4], count);
                --count;
                x -= 1;
            }
            // 좌
            if (isOpened[2] == true) {
                y -= 1;
                maps[x][y] = ++count;
                changeCoordinate(maps, x, y, new boolean[4], count);
                --count;
                y += 1;
            }
            // 우
            if (isOpened[3] == true) {
                y += 1;
                maps[x][y] = ++count;
                changeCoordinate(maps, x, y, new boolean[4], count);
                --count;
                y -= 1;
            }
        }
        return 0;
    }


    public int solution(int[][] maps) {
        int answer = 0;
        // 상,하,좌,우
        boolean[] isOpened = new boolean[4];

        // 길의 개수 찾기
        for (int i = 0; i < maps.length; i++) {
            for (int j : maps[i]) {
                if (j == 1)
                    route++;
            }
        }

        maps[0][0] = 0;
        changeCoordinate(maps, 0, 0, isOpened, 1);

        System.out.println(Arrays.deepToString(maps));

        return 1;
    }
}
