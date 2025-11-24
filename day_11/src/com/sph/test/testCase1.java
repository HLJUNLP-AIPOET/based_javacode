package com.sph.test;

import java.util.ArrayList;
import java.util.Scanner;

public class testCase1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 20));
        list.add(new Student("李四", 22));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        Student student = new Student(name, age);
        list.add(student);
        System.out.println(list);
    }
}
