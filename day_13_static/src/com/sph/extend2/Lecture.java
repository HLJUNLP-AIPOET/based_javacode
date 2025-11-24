package com.sph.extend2;

public class Lecture extends Teacher{
    private String lecture;

    public Lecture() {
    }

    public Lecture(String name, int id, double salary, String teacher, String lecture) {
        super(name, id, salary, teacher);
        this.lecture = lecture;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lecture='" + lecture + '\'' + super.toString() +
                '}';
    }
}
