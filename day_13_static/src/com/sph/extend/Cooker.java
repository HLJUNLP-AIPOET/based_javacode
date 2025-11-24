package com.sph.extend;

public class Cooker extends User {

    public Cooker() {
    }

    public Cooker(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("做饭");
    }

    @Override
    public String toString() {
        return "Cooker{"+ super.toString()+"}";
    }

    public void eat(){
        System.out.println("厨师吃饭");
    }
}
