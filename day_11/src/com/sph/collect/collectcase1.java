package com.sph.collect;

import java.util.ArrayList;

public class collectcase1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("123");
        System.out.println(list);
        list.remove("Apple");
        list.remove(2);
        list.set(0, "Banana");
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
