package com.sph.Demo1;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog("乌黑",3);
        Animal animal1 = new Cat("银色",2);
        Person person = new Person("小明",18);

        person.keepPet(animal,"骨头");
        person.keepPet(animal1,"鱼");


    }
}
