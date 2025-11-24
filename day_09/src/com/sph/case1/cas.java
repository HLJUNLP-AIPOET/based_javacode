package com.sph.case1;

public class cas {
    public static void main(String[] args) {
        String a = "asdfg";
        String b = "sdfga";
        String next = rotate(a);
        int n = a.length();
        while (n > 0) {
            next = rotate(next);
            if (b.equals(next)) {
                System.out.println("Yes");
                return;
            }
            n--;
        }
    }
    public static String rotate(String s) {
        char first = s.charAt(0);
        String end = s.substring(1);
        return end + first;
    }
}
