package com.sph.bean;

public class test {
    public static <Roles> void main(String[] args) {
        role r1 = new role("盖伦",100);
        role r2 = new role("提莫",100);
        while (true){
            r1.attack(r2);
            if (r2.getXue() <= 0){
                break;
            }
            r2.attack(r1);
            if (r1.getXue() <= 0){
                break;
            }
        }
        if (r1.getXue() > 0){
            System.out.println(r1.getName() + "赢了");
        }else {
            System.out.println(r2.getName() + "赢了");
        };

        role [] roles = new role[10];
        roles[0] = r1;
        roles[1] = r2;
        for (role role : roles) {
            System.out.println(role);
        }
    }
}
