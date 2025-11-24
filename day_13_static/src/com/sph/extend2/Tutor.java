package com.sph.extend2;

public class Tutor extends Teacher{
    private String tutor;

    public Tutor() {
    }

    public Tutor(String name, int id, double salary, String teacher, String tutor) {
        super(name, id, salary, teacher);
        this.tutor = tutor;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "tutor='" + tutor + '\'' + super.toString() +
                '}';
    }
}
