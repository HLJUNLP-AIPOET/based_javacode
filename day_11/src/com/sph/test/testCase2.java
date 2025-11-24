package com.sph.test;

import java.util.ArrayList;

public class testCase2 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1, "admin", "123456"));
        list.add(new User(2, "sph", "654321"));
        System.out.println(list);
        System.out.println(getUser(11, list));
    }

    public static Boolean getUser(int id, ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                return true;
            }
        }
        System.out.println("查无此人");
        return false;
    }
}
