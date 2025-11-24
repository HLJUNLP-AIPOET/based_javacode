package com.sph.demo;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Student s1 = new Student();
        s1.setAge(10);
        s1.setName("asd");
        students.add(s1);
        Student s2 = new Student();
        s2.setAge(1110);
        s2.setName("qwe");
        students.add(s2);
        int max = ListUtil.GetMax(students);
        System.out.println("最大年龄为：" + max);
    }
}
