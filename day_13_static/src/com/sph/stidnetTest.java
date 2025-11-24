package com.sph;

public class stidnetTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.teacherName = "的期望";
        s1.setName("张三");
        s1.setAge(18);
        s1.study();
        System.out.println(s1);
        Student s2 = new Student();
        s2.setName("三");
        s2.setAge(12);
        s2.study();
        System.out.println(s2);
    }
}
