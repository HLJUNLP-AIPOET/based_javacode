package com.sph.ui;

import com.sph.bean.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements ActionListener, MouseListener {

    String path = "Game\\image\\login\\";

    static ArrayList<User> users = new ArrayList<>();
    static {
        users.add(new User("孙培洪", "123"));
        users.add(new User("a", "123"));
    }

    JTextField usernameJTextField = new JTextField();
    JPasswordField passwordJPasswordField = new JPasswordField();
    JTextField yanzhengmaJTextField = new JTextField();
    JButton loginJButton = new JButton();
    JButton registerJButton = new JButton();


    public LoginJFrame() {
        initJFrame();
        initMenu();

        this.setVisible(true);
    }

    private void initMenu() {
        //用户名
        JLabel usernameJLabel = new JLabel(new ImageIcon(path + "用户名.png"));
        usernameJLabel.setBounds(116,135,47,17);
        this.getContentPane().add(usernameJLabel);

        usernameJTextField.setBounds(195,130,200,30);
        this.getContentPane().add(usernameJTextField);

        //密码
        JLabel passwordJLabel = new JLabel(new ImageIcon(path + "密码.png"));
        passwordJLabel.setBounds(125,195,32,16);
        this.getContentPane().add(passwordJLabel);

        passwordJPasswordField.setBounds(195,190,200,30);
        this.getContentPane().add(passwordJPasswordField);

        //验证码
        JLabel yanzhengmaJLabel = new JLabel(new ImageIcon(path + "验证码.png"));
        yanzhengmaJLabel.setBounds(118,250,50,30);
        this.getContentPane().add(yanzhengmaJLabel);

        yanzhengmaJTextField.setBounds(195,250,100,30);
        this.getContentPane().add(yanzhengmaJTextField);

        //登录
        loginJButton.setBounds(123,310,128,47);
        loginJButton.setIcon(new ImageIcon(path + "登录按钮.png"));
        loginJButton.setBorderPainted(false);
        loginJButton.setContentAreaFilled(false);
        this.getContentPane().add(loginJButton);

        //注册
        registerJButton.setBounds(256,310,128,47);
        registerJButton.setIcon(new ImageIcon(path + "注册按钮.png"));
        registerJButton.setBorderPainted(false);
        registerJButton.setContentAreaFilled(false);
        this.getContentPane().add(registerJButton);

        JLabel label = new JLabel(new ImageIcon(path + "background.png"));
        label.setBounds(0, 0, 470,390 );
        this.getContentPane().add(label);

        loginJButton.addMouseListener(this);
        registerJButton.addMouseListener(this);


    }
    public void showDialog(String content) {
        JDialog jDialog = new JDialog();
        jDialog.setModal(true);
        jDialog.setSize(250, 150);
        jDialog.setLocationRelativeTo(null);
        jDialog.setAlwaysOnTop(true);

        JLabel label = new JLabel(content);
        label.setBounds(0, 0, 200,150);
        jDialog.getContentPane().add(label);
        jDialog.setVisible(true);

    }

    private void initJFrame() {
        //登录界面
        this.setSize(488, 430);
        this.setTitle("拼图登录界面");
//        this.setAlwaysOnTop(true);//置顶
        this.setLocationRelativeTo(null);//居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭即退出程序
        this.setLayout(null);
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
            loginJButton.setIcon(new ImageIcon(path + "登录按下.png"));
        }else if (source == registerJButton) {
            registerJButton.setIcon(new ImageIcon(path + "注册按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object source = e.getSource();
        if (source == loginJButton) {
            loginJButton.setIcon(new ImageIcon(path + "登录按钮.png"));
            //获取输入的用户名与密码
            String username = usernameJTextField.getText();
            String password = passwordJPasswordField.getText();
            boolean flag = false;
            for (User user : users) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    //登录成功并确认提示框
                    flag = true;
                    JOptionPane.showMessageDialog(null, "登录成功！", "提示", JOptionPane.INFORMATION_MESSAGE);
                    new GameJFrame();

                    this.setVisible(false);

                    break;
                }
            }
            if (!flag) {
                JOptionPane.showMessageDialog(null, "用户名或密码错误,请重新输入！", "提示", JOptionPane.ERROR_MESSAGE);
            }
        }else if (source == registerJButton) {
            registerJButton.setIcon(new ImageIcon(path + "注册按钮.png"));
            this.setVisible(false);
            new RegisterJFrame();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
