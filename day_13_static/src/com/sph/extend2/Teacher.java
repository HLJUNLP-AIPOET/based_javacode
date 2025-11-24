package com.sph.extend2;

public class Teacher extends Employee {
    private String teacher;

    public Teacher() {
    }

    public Teacher(String name, int id, double salary, String teacher) {
        super(name, id, salary);
        this.teacher = teacher;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher='" + teacher + '\'' + super.toString() +
                '}';
    }
}
