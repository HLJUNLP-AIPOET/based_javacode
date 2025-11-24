package com.sph.test;

import java.util.ArrayList;

public class testCase3 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        list.add(new Phone("iPhone", 9999));
        list.add(new Phone("Samsung", 7999));
        list.add(new Phone("Xiaomi", 1999));
        System.out.println(list);
        System.out.println (findPhone(list, 12999));
    }
    public static ArrayList<Phone> findPhone(ArrayList<Phone> list, int price) {
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (price > list.get(i).getPrice()) {
                result.add(list.get(i));
            }
        }
        return result;

    }
}
