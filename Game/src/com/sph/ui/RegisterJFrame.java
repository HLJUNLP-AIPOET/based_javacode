package com.sph.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RegisterJFrame extends JFrame implements ActionListener, MouseListener {

    String path = "Game\\image\\register\\";

    JTextField usernameJTextField = new JTextField();
    JPasswordField passwordJPasswordField = new JPasswordField();
    JTextField passwordJPasswordField2 = new JTextField();
    JButton loginJButton = new JButton();
    JButton resetButton = new JButton();

    public RegisterJFrame() {

        initJFrame();
        initView();

        this.setVisible(true);
    }

    private void initView() {
        JLabel usernameLabel = new JLabel(new ImageIcon(path + "注册用户名.png"));
        usernameLabel.setBounds(95, 135, 80, 17);
        this.getContentPane().add(usernameLabel);

        usernameJTextField.setBounds(200, 130, 200, 30);
        this.getContentPane().add(usernameJTextField);

        JLabel passwordLabel = new JLabel(new ImageIcon(path + "注册密码.png"));
        passwordLabel.setBounds(110, 195, 65, 16);
        this.getContentPane().add(passwordLabel);

        passwordJPasswordField.setBounds(200, 190, 200, 30);
        this.getContentPane().add(passwordJPasswordField);

        JLabel passwordLabel2 = new JLabel(new ImageIcon(path + "再次输入密码.png"));
        passwordLabel2.setBounds(95, 255, 95, 16);
        this.getContentPane().add(passwordLabel2);

        passwordJPasswordField2.setBounds(200, 250, 200, 30);
        this.getContentPane().add(passwordJPasswordField2);

        loginJButton.setBounds(110, 310, 128, 47);
        loginJButton.setIcon(new ImageIcon(path + "注册按钮.png"));
        loginJButton.setBorderPainted(false);
        loginJButton.setContentAreaFilled(false);
        this.getContentPane().add(loginJButton);

        resetButton.setBounds(245, 310, 128, 47);
        resetButton.setIcon(new ImageIcon(path + "重置按钮.png"));
        resetButton.setBorderPainted(false);
        resetButton.setContentAreaFilled(false);
        this.getContentPane().add(resetButton);

        resetButton.addMouseListener(this);
        loginJButton.addMouseListener(this);

        JLabel label = new JLabel(new ImageIcon(path + "background.png"));
        label.setBounds(0, 0, 470,390 );
        this.getContentPane().add(label);
    }

    private void initJFrame() {
        //注册界面
        this.setSize(488, 430);
        this.setTitle("拼图注册界面");
        this.setAlwaysOnTop(true);//置顶
        this.setLocationRelativeTo(null);//居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭即退出程序

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
        if (source == loginJButton) {
            loginJButton.setIcon(new ImageIcon(path + "注册按下.png"));
        } else if (source == resetButton) {
            resetButton.setIcon(new ImageIcon(path + "重置按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object source = e.getSource();
        if (source == loginJButton) {
            loginJButton.setIcon(new ImageIcon(path + "注册按钮.png"));
        } else if (source == resetButton) {
            resetButton.setIcon(new ImageIcon(path + "重置按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
