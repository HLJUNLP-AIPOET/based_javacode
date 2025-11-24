package com.sph.duotai;

public class Student extends User{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
    public void show(){
        System.out.println("Student{name = " + getName() + ", age = " + getAge() + "}");
    }
}
