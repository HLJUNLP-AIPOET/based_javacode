package com.sph.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(608, 680);
        jf.setTitle("拼图小游戏");
        jf.setAlwaysOnTop(true);//置顶
        jf.setLocationRelativeTo(null);//居中
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭即退出程序
        jf.setLayout(null);//取消内部默认布局


        JButton jButton = new JButton("疯狂点我！！！");
        jButton.setBounds(100,100,100,50);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了！！！");
            }
        });





        jf.getContentPane().add(jButton);



        jf.setVisible(true);
    }
}
