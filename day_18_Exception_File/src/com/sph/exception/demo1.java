package com.sph.exception;

public class demo1 {
    public static void main(String[] args) {

    Student[] students = new Student[3];
//    students[0] = new Student("张三", 18);
    try {
            String names = students[0].getName();
            String name = students[1].getName();

            System.out.println(names);
            System.out.println(name);
            System.out.println("try代码块");
        } catch (Exception e) {
        e.printStackTrace();
        }
    System.out.println("后续代码");
    System.err.println("后续代码");
    }
}
