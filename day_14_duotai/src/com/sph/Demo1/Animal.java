package com.sph.Demo1;

public class Animal {
    private String yellow;
    private int age;

    public Animal() {

    }


    public void eat(String Something) {
        System.out.println("动物在吃 "+ Something +" !!!");
    }

    public  String getYellow() {
        return yellow;
    }

    public void setYellow(String yellow) {
        this.yellow = yellow;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String yellow, int age) {
        this.yellow = yellow;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "yellow='" + yellow + '\'' +
                ", age=" + age +
                '}';
    }
}
