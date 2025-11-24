package com.sph.duotai;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Teacher t1 = new Teacher("Bob", 35);
        Administrator a1 = new Administrator("Charlie", 40);

        register(s1);
        register(t1);
        register(a1);
    }


    public static void register(User user){
        user.show();
    }
}
