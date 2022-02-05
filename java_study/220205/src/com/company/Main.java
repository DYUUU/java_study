package com.company;

import java.util.*;

public class Main {
    public static final int a=0;
    static final int b=0;
    final int c=0;
    int d=0;

    public static void main(String[] args) {
	// write your code here
    //1. Thread
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    for(int i=0;i<10;i++){
                        System.out.println("Thread");
                        Thread.currentThread().sleep(1000);
                    }
                }catch (Exception e){

                }
            }
        });
        Thread b= new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    for(int i=0;i<10;i++){
                        System.out.println("Thread3");
                        Thread.currentThread().sleep(1000);
                    }
                }catch (Exception e){

                }
            }
        });

        List<Integer> list = new ArrayList<>();

        a.run();
        b.run();
        System.out.println("hello");
    }

    public static void print(String str){
        System.out.println(str);
    }
}
