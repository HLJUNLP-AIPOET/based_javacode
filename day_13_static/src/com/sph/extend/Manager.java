package com.sph.extend;

public class Manager extends User {
    private int bonus;

    public Manager(int id, String name, int salary, int bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public Manager() {
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    @Override
    public void work(){
        System.out.println("管理员工");
    }

    public void eat(){
        System.out.println("管理员工饭");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus + super.toString() +
                '}';
    }
}
