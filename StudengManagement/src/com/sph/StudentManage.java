package com.sph;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    public static void main(String[] args) {
        ArrayList<User> user =  initInfo();
        while (true) {
            System.out.println("-----------欢迎来到学生管理系统----------");
            System.out.println("请选择 (1)：登录 (2):注册");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1":
                    login(user);
                    break;
                case "2":
                    register(user);
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
            }
        }
    }
    public static void login(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        while (n>0) {
            System.out.println("请输入用户名！");
            String name = sc.next();
            System.out.println("请输入密码！");
            String password = sc.next();
            System.out.println("请输入验证码！");
            System.out.println("8 + 2 = ?");
            String code = sc.next();
            boolean flag = false;
            while (!flag) {
                if (!code.equals("10")) {
                    System.out.println("验证码错误，请重新输入！");
                    code = sc.next();
                }else {
                    flag = true;
                }
            }
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getName().equals(name) && users.get(i).getPassword().equals(password)) {
                    System.out.println("登录成功！");
                    manageMenu();
                }
            }
            n--;
            System.out.println("用户名或密码错误, 您还有"+n+"次机会！");
        }
        System.out.println("1: 忘记密码 或 2: 重新登录！");
        String choice = sc.next();
        switch (choice) {
            case "1": forget(users);break;
            case "2": login(users);break;
            default:
                System.out.println("请重新选择");
        }

    }

    private static void forget(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名！");
        String name = sc.next();
        System.out.println("请输入身份证号！");
        String identifier = sc.next();
        System.out.println("请输入手机号！");
        String phoneNumber = sc.next();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name) && users.get(i).getIdentifier().equals(identifier)
            && users.get(i).getPhoneNumber().equals(phoneNumber)) {
                System.out.println("验证成功！请输入新密码！");
                String newPassword = sc.next();
                users.get(i).setPassword(newPassword);
                System.out.println("密码修改成功！请重新登录！");
                login(users);
            }
        }
        System.out.println("验证失败！请重新选择！");
    }

    public static void register(ArrayList<User> users) {
        System.out.println("请输入用户名！");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name)) {
                System.out.println("用户名已存在，请重新注册！");
                register(users);
            }
            System.out.println("请输入密码！");
            String password = sc.next();
            System.out.println("请输入身份证号！");
            String identifier = sc.next();
            boolean id = false;
            while (!id) {
                if (identifier.length()!=18) {
                    System.out.println("身份证号不合规，请重新输入：");
                    identifier = sc.next();
                }else {
                    id = true;
                }
            }
            System.out.println("请输入手机号！");
            String phoneNumber = sc.next();
            while (id) {
                if (identifier.length()!=11) {
                    System.out.println("手机号不合规，请重新输入：");
                    identifier = sc.next();
                }else {
                    id = false;
                }
            }
            User newUser = new User(name, password, identifier, phoneNumber);
            users.add(newUser);
            System.out.println("注册成功！请登录！");
            login(users);
        }
    }

    public static void manageMenu() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "张三", 20));
        students.add(new Student(2, "李四", 21));
        while (true) {
            System.out.println("--------学生管理系统--------");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 查询学生");
            System.out.println("5. 全部学生");
            System.out.println("0. 退出系统");
            System.out.println("--------------------------");
            System.out.print("请输入操作指令：");

            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1":
                    insertStudent(students);
                    break;
                case "2":
                    deleteStudent(students);
                    break;
                case "3":
                    updateStudent(students);
                    break;
                case "4":
                    selectStudent(students);
                    break;
                case "5":
                    showStudent(students);
                    break;
                case "0":
                    exitSystem();
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
            }
        }
    }

    private static void showStudent(ArrayList<Student> students) {
        System.out.println("全部学生信息如下：");
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", 姓名: " + student.getName() + ", 年龄: " + student.getAge());
        }
    }

    private static void exitSystem() {
        System.out.println("退出系统");
        System.exit(0);
    }

    private static void selectStudent(ArrayList<Student> students) {
        System.out.println("查询学生信息");
        System.out.println("请输入学生姓名进行查询");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println("学生信息如下：");
                System.out.println("ID: " + student.getId());
                System.out.println("姓名: " + student.getName());
                System.out.println("年龄: " + student.getAge());
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("未找到该学生信息");
    }

    private static void updateStudent(ArrayList<Student> students) {
        System.out.println("修改学生信息");
        System.out.println("请输入学生ID进行修改");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("请输入新的学生姓名：");
                String newName = sc.next();
                System.out.println("请输入新的学生年龄：");
                int newAge = sc.nextInt();
                student.setName(newName);
                student.setAge(newAge);
                System.out.println("学生信息修改成功！");
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("未找到该学生信息");
    }

    private static void deleteStudent(ArrayList<Student> students) {
        System.out.println("删除学生信息");
        System.out.println("请输入学生ID进行删除");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("学生信息删除成功！");
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("未找到该学生信息");
    }

    private static void insertStudent(ArrayList<Student> students) {
        System.out.println("添加学生信息");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生ID：");
        int id = sc.nextInt();
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        Student student = new Student(id, name, age);
        students.add(student);
        System.out.println("学生信息添加成功！");
    }

    private static ArrayList<User> initInfo() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("admin", "admin123", "410325200112099911", "1234567890"));
        System.out.println("初始化用户信息完成！");
        return users;
    }
}
