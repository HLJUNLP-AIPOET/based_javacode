package com.sph.Demo02;

import java.util.*;

public class CollectionStable {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        Collections.addAll(list, "张三", "李四", "王麻子", "李素", "高尚", "赵青蛙", "孙凤");

        list.stream().filter(s -> s.length() == 2).forEach(s -> System.out.println(s));

    }

}
