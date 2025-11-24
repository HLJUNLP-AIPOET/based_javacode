package com.sph.string;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String num = sc.nextLine();
        System.out.println("加密后的手机号为：");
        String firstSub = num.substring(0, 3);
        String lastSub = num.substring(7);
        System.out.println(firstSub + " **** " + lastSub);

    }
}
