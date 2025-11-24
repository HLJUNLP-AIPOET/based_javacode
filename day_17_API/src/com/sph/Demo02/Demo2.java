package com.sph.Demo02;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        Collections.addAll(list, "张三", "李四", "王麻子", "李素", "高尚", "赵青蛙", "孙凤");

        for (int i = 0; i < 22; i++) {
            System.out.println("=======第"+(i+1)+"次点名！！=======");
            while (!list.isEmpty()) {
                Collections.shuffle(list);
                String s = list.removeFirst();
                System.out.println(s);
                list2.add(s);

            }
            System.out.println("点名结束!!");
            list.addAll(list2);
            list2.clear();
        }
    }
}
