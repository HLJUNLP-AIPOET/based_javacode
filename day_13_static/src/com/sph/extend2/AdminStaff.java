package com.sph.extend2;

public class AdminStaff extends Employee {
    private String staff;

    public AdminStaff() {
    }

    public AdminStaff(String name, int id, double salary, String staff) {
        super(name, id, salary);
        this.staff = staff;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "AdminStaff{" +
                "staff='" + staff + '\'' + super.toString() +
                '}';
    }
}
