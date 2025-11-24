package com.sph.ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        //游戏主界面
        JFrame gameFrame = new JFrame();
        gameFrame.setSize(608, 680);
        gameFrame.setVisible(true);

        //登录界面
        JFrame loginFrame = new JFrame();
        loginFrame.setSize(488, 430);
        loginFrame.setVisible(true);

        //注册界面
        JFrame registerFrame = new JFrame();
        registerFrame.setSize(488, 500);
        registerFrame.setVisible(true);
    }
}
