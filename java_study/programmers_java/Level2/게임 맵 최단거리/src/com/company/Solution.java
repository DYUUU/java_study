package com.company;

public class Solution {
    public int answer = 0;

    public void changeCoordinate(int[][] maps, int x, int y, int count) {

        if (x == maps.length - 1 && y == maps[0].length - 1) {
            // 목적지에 도착헀다면 stop
            int dst = maps[maps.length - 1][maps[0].length - 1];
            if (dst < answer || answer == 0) {
                answer = dst;
            }
        } else {
                // 상
                if (x - 1 >= 0) {
                    if (maps[x - 1][y] == 1 || maps[x - 1][y] > count) {
                        maps[--x][y] = ++count;
                        changeCoordinate(maps, x++, y, count--);
                    }
                }
                // 하
                if (x + 1 <= maps.length - 1) {
                    if (maps[x + 1][y] == 1 || maps[x + 1][y] > count) {
                        maps[++x][y] = ++count;
                        changeCoordinate(maps, x--, y, count--);
                    }
                }
                // 좌
                if (y - 1 >= 0) {
                    if (maps[x][y - 1] == 1 || maps[x][y - 1] > count) {
                        maps[x][--y] = ++count;
                        changeCoordinate(maps, x, y++, count--);
                    }
                }
                // 우
                if (y + 1 <= maps[0].length - 1) {
                    if (maps[x][y + 1] == 1 || maps[x][y + 1] > count) {
                        maps[x][++y] = ++count;
                        changeCoordinate(maps, x, y--, count--);
                    }
                }
            }
        }


    public int solution(int[][] maps) {

        if (maps[maps.length - 1][maps[0].length - 2] == 0 && maps[maps.length - 2][maps[0].length - 1] == 0) {
            return -1;
        } else {
            changeCoordinate(maps, 0, 0, 1);
            System.out.println(answer);
            return answer;
        }
    }
}