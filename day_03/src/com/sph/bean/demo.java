package com.sph.bean;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println(student);
    }

    public static class Student {
        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    '}';
        }
    }
}
