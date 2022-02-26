
public class Solution {
    public int route = 0;
    public int answer = 0;

    public void changeCoordinate(int[][] maps, int x, int y, int count) {
        int dst = maps[maps.length - 1][maps.length - 1];
        // 모든 루트를 다 돌았을 때 실패
        if (count == route - 1) {
            answer = -1;
        }
        // 목적지에 도착헀다면 stop
        if (dst > 1) {
            if(answer<=0||dst<answer)
                answer = count;
        }
        {
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
            if (y + 1 <= maps.length - 1) {
                if (maps[x][y + 1] == 1 || maps[x][y + 1] > count) {
                    maps[x][++y] = ++count;
                    changeCoordinate(maps, x, y--, count--);
                }
            }
        }
    }


    public int solution(int[][] maps) {

        // 길의 개수 찾기
        for (int i = 0; i < maps.length; i++) {
            for (int j : maps[i]) {
                if (j == 1)
                    route++;
            }
        }

        maps[0][0] = 1;
        changeCoordinate(maps, 0, 0, 1);

        System.out.println(answer);

        return answer;
    }
}