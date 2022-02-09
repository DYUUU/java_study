package com.company;

import java.util.Arrays;

public class Solution2 {

    public class Left {
        int row = 3;
        int col = 0;
        int abs = 0;

        public void coordinateChange(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public void setAbs(int row, int col) {
            this.abs = Math.abs(row - this.row) + Math.abs(col - this.col);
        }
    }

    public class Right {
        int row = 3;
        int col = 2;
        int abs = 0;

        public void coordinateChange(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public void setAbs(int row, int col) {
            this.abs = Math.abs(row - this.row) + Math.abs(col - this.col);
        }
    }


    public String solution(int[] numbers, String hand) {
        String answer = "";

        Left left = new Left();
        Right right = new Right();

        Integer[][] intArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 0, 11}
        };

        for (int i : numbers) {
            for (int row = 0; row < 4; row++) {
                int col = Arrays.asList(intArray[row]).indexOf(i);

                if (col < 0)
                    continue;
                // 좌측일 경우
                else if (col == 0) {
                    answer += "L";
                    left.coordinateChange(row, col);
                }
                // 가운데일 경우
                else if (col == 1) {
                    right.setAbs(row, col);
                    left.setAbs(row, col);

                    if (right.abs > left.abs) {
                        answer += "L";
                        left.coordinateChange(row, col);
                    } else if (right.abs < left.abs) {
                        answer += "R";
                        right.coordinateChange(row, col);
                    } else {
                        if (hand.equals("right")) {
                            answer += "R";
                            right.coordinateChange(row, col);
                        } else if (hand.equals("left")) {
                            answer += "L";
                            left.coordinateChange(row, col);
                        }
                    }
                }
                // 우측일 경우
                else if (col == 2) {
                    answer += "R";
                    right.coordinateChange(row, col);
                }
            }
        }

        return answer;
    }
}
