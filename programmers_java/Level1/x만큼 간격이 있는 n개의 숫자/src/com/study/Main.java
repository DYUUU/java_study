package com.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static class Parent{
        int index;
        String name;

        Parent(int index,String name){
            this.index=index;
            this.name=name;
        }
        Parent(){  }

        void setName(String str){
            name=str;
        }
        @Override
        public String toString() {
            return "Parent{name='" + name + '\'' + '}';
        }
    }

    public static void main(String[] args) {
        int a =1;
        Integer i = new Integer(1);
        String number="129837587236496235";
        Long.valueOf(number);
        Parent p = new Parent();
        p.name="재형";
        p.index=0;
        System.out.println(p.name);
        p.setName("주람");
        System.out.println(p.name);
        System.out.println(p);

        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[3];
        arr[0]=3;
        arr[1]=1;
        arr[2]=2;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        list.add(9);
        list.add(6);
        list.add(7);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(5);
        System.out.println(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);
        List<Integer> l = new ArrayList<>();
    }

    public static void changeName(Parent p){
        p.name="주람";
    }

}
