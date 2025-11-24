package com.sph.test;

import com.sph.bean.GirlFriend;

public class test {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("Alice");
        gf1.setAge(25);
        gf1.setSex("女");
        System.out.println(gf1);
    }
}
