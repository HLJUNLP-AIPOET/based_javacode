package com.sph.Demo01;

import java.util.*;

public class HashMapDemo02 {

    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();

        Person p1 = new Person("asda",18);
        Person p2 = new Person("xsads",13);
        Person p3 = new Person("ghew",17);
        Person p4 = new Person("fgew3",33);

        map.put(p1,"A");
        map.put(p2,"B");
        map.put(p3,"A");
        map.put(p4,"D");


        System.out.println(map);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);




        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            switch (entry.getValue()) {
                case "A" -> list.set(0, list.getFirst() + 1);
                case "B" -> list.set(1, list.get(1) + 1);
                case "C" -> list.set(2, list.get(2) + 1);
                case "D" -> list.set(3, list.get(3) + 1);
            }
        }


        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("A", list.get(0));
        map2.put("B", list.get(1));
        map2.put("C", list.get(2));
        map2.put("D", list.get(3));

        System.out.println(map2);


    }
}
