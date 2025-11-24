package com.sph.demo;

public class PingpangPlayer extends Player implements English {
    public PingpangPlayer() {
    }

    public PingpangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
