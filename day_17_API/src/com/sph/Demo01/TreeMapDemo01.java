package com.sph.Demo01;

import java.util.TreeMap;

public class TreeMapDemo01 {
    public static void main(String[] args) {


        TreeMap<Person, String> treeMap = new TreeMap();
        treeMap.put(new Person("aa", 17),"北京");
        treeMap.put(new Person("ab", 16),"北京");
        treeMap.put(new Person("ba", 12),"上海");
        treeMap.put(new Person("bc", 28),"北京");
        treeMap.put(new Person("e", 22),"北京");

        System.out.println(treeMap);

    }
}
