package com.sph.method;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = add(a, b);
        System.out.println("sum = " + sum);

        int c = 30;
        int d = 40;
        int sum2 = add(c, d);
        System.out.println("c和d的和为：");
        System.out.println("sum2 = " + sum2);

        double e = 10.0;
        double f = 20.0;
        double sum3 = add(e, f);
        System.out.println("e和f的和为：");
        System.out.println("sum3 = " + sum3);
    }

    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    public static int add(int a, int b, int c, int d){
        return a + b + c + d;
    }
    public static double add(double a, double b){
        return a + b;
    }
}
