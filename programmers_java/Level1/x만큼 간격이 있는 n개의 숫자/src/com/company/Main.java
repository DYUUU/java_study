package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        // 변수 받기
        System.out.println("x를 입력해 주세요");
        int x = sc.nextInt();
        System.out.println("n를 입력해 주세요");
        int n = sc.nextInt();

        sol.solution(x,n);

    }
}