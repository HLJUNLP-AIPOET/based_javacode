package com.sph.bean;

import java.util.Random;

public class role {
    private String name;
    private int xue;

    public role() {
    }

    public role(String name, int xue) {
        this.name = name;
        this.xue = xue;
    }

    //攻击
    public void attack(role r) {
        Random rand = new Random();
        int hurt = rand.nextInt(30)+2;
        r.setXue(r.getXue() - hurt);
        int remainXue = r.getXue();
        remainXue = remainXue < 0 ? 0 : remainXue;
        System.out.println(this.getName() + "攻击了" + r.getName() + ", " + r.getName() + "掉了" +hurt+ "滴血, "+ "剩余血量为" + remainXue);
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return xue
     */
    public int getXue() {
        return xue;
    }

    /**
     * 设置
     * @param xue
     */
    public void setXue(int xue) {
        this.xue = xue;
    }

    public String toString() {
        return "person{name = " + name + ", xue = " + xue + "}";
    }
}
