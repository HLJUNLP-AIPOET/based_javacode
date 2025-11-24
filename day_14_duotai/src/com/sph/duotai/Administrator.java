package com.sph.duotai;

public class Administrator extends User{
    public Administrator() {
    }

    public Administrator(String name, int age) {
        super(name, age);
    }

    @Override
    public void show(){
        System.out.println("Administrator{name = " + getName() + ", age = " + getAge() + "}");
    }
}
