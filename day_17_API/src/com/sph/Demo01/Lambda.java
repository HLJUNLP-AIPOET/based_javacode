package com.sph.Demo01;

import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {


        String [] arr = {"aa","aaa","b","cccc","ddddd"};



        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
