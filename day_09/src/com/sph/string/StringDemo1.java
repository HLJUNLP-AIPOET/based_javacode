package com.sph.string;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a string:");
//        String s = sc.next();
//        System.out.println(s);
        String s1 = "Hello!";
        System.out.println(s1);
        String s2 = "World!";
        System.out.println(s1+s2);
        char[] chars = new char[2];
        chars[0] = 'a';
        chars[1] = 'b';
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            System.out.println(c);
        }
//        System.out.println(s1.equals(s));

    }
}
