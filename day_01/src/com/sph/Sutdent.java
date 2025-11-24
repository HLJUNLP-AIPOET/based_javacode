package com.sph;

public class Sutdent {
    String name;
    int age;

    public void study() {
        System.out.println(name + "正在学习");
    }

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
        return "Sutdent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
