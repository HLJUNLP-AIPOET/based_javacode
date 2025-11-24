package com.sph.std;

public class Std_Test {
    public static void main(String[] args) {
        Student s1 = new Student(1,"张三",18);
        Student s2 = new Student(2,"李四",19);
        Student s3 = new Student(3,"王五",20);
        Student [] stds = new Student[10];
        stds[0] = s1;
        stds[1] = s2;
        stds[2] = s3;
        Student s4 = new Student(4,"王五",20);
        boolean contains = Student.contains(stds, s4.getId());
        if (contains) {
            System.out.println("ID已存在，添加失败");
        } else {
            stds[3] = s4;
            System.out.println("添加成功");
        }

        for (Student std : stds) {
            System.out.println(std);
        }


    }
}
