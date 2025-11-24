package com.sph.classDemo;

public class text {
    public static void main(String[] args) {
        new Inter(){                //匿名内部类
            @Override
            public void show() {
                System.out.println("匿名内部类实现接口");
            }
        };
    }
}
