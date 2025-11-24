package com.sph.extend;

public class User {
    private int id;
    private String name;
    private int salary;

    public void work(){
        System.out.println("工作");
    }
    public void eat(){
        System.out.println("吃饭");
    }

    public User() {
    }

    public User(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "User{id = " + id + ", name = " + name + ", salary = " + salary + "}";
    }
}


