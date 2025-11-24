package com.sph.Demo02;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "张三", "李四", "王麻子", "李素", "高尚", "大青蛙", "孙凤");

        Collections.shuffle(list);



        System.out.println(list.get(0));


    }
}
