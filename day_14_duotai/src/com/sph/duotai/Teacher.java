package com.sph.duotai;

public class Teacher extends User{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
    public void show(){
        System.out.println("Teacher{name = " + getName() + ", age = " + getAge() + "}");
    }
}
