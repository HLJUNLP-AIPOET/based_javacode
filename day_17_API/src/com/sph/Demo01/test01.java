package com.sph.Demo01;

import java.io.IOException;

public class test01 {
    public static void main(String[] args) throws IOException {

//        System.out.println(Math.random());
//        System.out.println(Math.abs(-2));
//        System.out.println(System.currentTimeMillis());  //1763521628985

        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.availableProcessors());
        System.out.println(rt.freeMemory()/1024/1024);
        System.out.println(rt.maxMemory()/1024/1024);
        System.out.println(rt.totalMemory()/1024/1024);

        rt.exec("notepad");
//      rt.exec("shutdown -s -t 3600");
        rt.exec("shutdown -a");
    }
}
