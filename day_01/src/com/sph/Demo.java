package com.sph;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //注释
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        System.out.println("你输入的整数是：" + num);
        System.out.println("请输入一个小数：");
        double age = sc.nextDouble();
        System.out.println("你输入的小数是：" + age);
        System.out.println("两个数的和是：" + (num + age));
        sc.close();
        //创建学生对象
        Sutdent s = new Sutdent();
        s.age = num;
        s.setName("张三");
        //调用学生对象的方法
        s.study();
        //toString方法
        System.out.println(s);
    }
}
