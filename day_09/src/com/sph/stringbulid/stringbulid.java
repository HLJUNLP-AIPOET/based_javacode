package com.sph.stringbulid;

public class stringbulid {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
