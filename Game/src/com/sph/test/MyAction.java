package com.sph.test;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class MyAction extends JFrame implements ActionListener, MouseListener, KeyListener {

    JButton jb1 = new JButton("按钮1");
    JButton jb2 = new JButton("按钮2");


    public MyAction() {
        this.setSize(608, 680);
        this.setTitle("拼图小游戏");
        this.setAlwaysOnTop(true);//置顶
        this.setLocationRelativeTo(null);//居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭即退出程序
        this.setLayout(null);//取消内部默认布局


        this.addKeyListener(this);

//        jb1.setBounds(100,100,100,50);
//        jb2.setBounds(300,100,100,50);
//
//        jb1.addMouseListener(this);
//        jb2.addMouseListener(this);
//
//        jb1.addActionListener(this);
//        jb2.addActionListener(this);
//
//        this.getContentPane().add(jb1);
//        this.getContentPane().add(jb2);


        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == jb1) {
            Random r = new Random();
            jb1.setSize(r.nextInt(500),r.nextInt(500));
        }else if (source == jb2) {
            Random r = new Random();
            jb2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标被点击了！！！");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标被按下了！！！");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标被释放了！！！");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标进入组件了！！！");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标退出组件了！！！");
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        System.out.println("键盘被输入了！！！");
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println("键盘被按下了！！！");
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("键盘被释放了！！！");
        int keyCode = e.getKeyCode();
//        System.out.println("释放的键盘码是："+keyCode);
        //如果按下的是w
        if (keyCode == 87) {
            System.out.println("向上移动");
        } else if (keyCode == 83) {
            System.out.println("向下移动");
        } else if (keyCode == 65) {
            System.out.println("向左移动");
        } else if (keyCode == 68) {
            System.out.println("向右移动");
        }
    }
}
