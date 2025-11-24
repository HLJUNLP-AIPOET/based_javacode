package com.sph.Demo1;

public class Dog extends Animal{
    public Dog(String yellow, int age) {
        super(yellow, age);
    }

    @Override
    public void eat(String Something) {
        System.out.println(super.getAge()+"岁的"+super.getYellow()+"色的小狗缩着双脚在吃"+ Something +" !!!");
    }

    public void lookHome(){
        System.out.println("小狗在看家 !!!");
    }
}
