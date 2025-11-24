package com.sph.extend;

public class test {
    public static void main(String[] args) {
        Manager manager = new Manager(1,"sph",10000,5000);
        System.out.println(manager);
        manager.work();
        manager.eat();

        Cooker cooker = new Cooker(2,"ls",8000);
        System.out.println(cooker);
        cooker.work();
        cooker.eat();
    }
}
