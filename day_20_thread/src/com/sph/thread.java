package com.sph;

public class thread {
    public static void main(String[] args) {


        demo1 t = new demo1();
        demo1 t2 = new demo1();
        t.start();
        t2.start();
    }
}
