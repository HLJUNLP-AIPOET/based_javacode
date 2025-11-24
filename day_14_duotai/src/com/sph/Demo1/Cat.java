package com.sph.Demo1;

public class Cat extends Animal {

    public Cat() {
        super();

    }

    public Cat(String yellow, int age) {
        super(yellow, age);
    }

    @Override
    public void eat(String Something) {
        System.out.println(super.getAge()+"岁的"+super.getYellow()+"色的小猫眯着眼睛在吃"+ Something +" !!!");
    }

    public void catchMouse(){
        System.out.println("小猫在抓老鼠 !!!");
    }
}
