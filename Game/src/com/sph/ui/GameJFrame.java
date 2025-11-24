package com.sph.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int [][] arr2 = new int[4][4];
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};

    int x;
    int y;

    String path = "Game\\image\\animal\\animal3\\";

    int [][] win = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    int number = 0;

    JMenuItem replayJMenuItem = new JMenuItem("重新游戏");
    JMenuItem reloginJMenuItem = new JMenuItem("重新登录");
    JMenu changeImgJMenuItem = new JMenu("更换图片");
    JMenuItem closeJMenuItem = new JMenuItem("关闭游戏");
    JMenuItem aboutUsJMenuItem = new JMenuItem("请联系我");
    JMenuItem girlJMenuItem = new JMenuItem("美女");
    JMenuItem animalJMenuItem = new JMenuItem("动物");
    JMenuItem sportJMenuItem = new JMenuItem("运动");

    public GameJFrame() {
        //打乱数组
        initArr();

        //游戏主界面
        initJFrame();

        //初始化菜单
        initMenu();

        //初始化图片
        initImage();

        showJFrame();
    }

    private void initJFrame() {
        this.setSize(608, 680);
        this.setTitle("拼图小游戏");
        this.setAlwaysOnTop(true);//置顶
        this.setLocationRelativeTo(null);//居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭即退出程序
        this.setLayout(null);//取消内部默认布局

        this.addKeyListener(this);
    }

    private void initImage() {
        this.getContentPane().removeAll();

        if (victory()){
            JLabel winJLabel = new JLabel(new ImageIcon("Game\\image\\win.png"));
            winJLabel.setBounds(203,283,200,73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepJLabel = new JLabel("步数："+ number);
        stepJLabel.setBounds(50,40,100,20);
        this.add(stepJLabel);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel label = new JLabel(new ImageIcon(path+ arr2[j][i] +".jpg"));
                //指定位置
                label.setBounds(105 * i +83, 105 * j + 134, 105, 105);
                //添加边框
                label.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(label);
            }
        }
        //背景图
        ImageIcon bg = new ImageIcon("Game\\image\\background.png");
        JLabel background = new JLabel(bg);
        background.setBounds(40, 40, bg.getIconWidth(), bg.getIconHeight());
        this.getContentPane().add(background);

        this.getContentPane().repaint();
    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu functionJMenu = new JMenu("主要功能");
        JMenu aboutJMenu = new JMenu("关于作者");

        aboutJMenu.add(aboutUsJMenuItem);

        functionJMenu.add(changeImgJMenuItem);
        functionJMenu.add(replayJMenuItem);
        functionJMenu.add(reloginJMenuItem);
        functionJMenu.add(closeJMenuItem);

        changeImgJMenuItem.add(girlJMenuItem);
        changeImgJMenuItem.add(animalJMenuItem);
        changeImgJMenuItem.add(sportJMenuItem);

        menuBar.add(functionJMenu);
        menuBar.add(aboutJMenu);

        replayJMenuItem.addActionListener(this);
        reloginJMenuItem.addActionListener(this);
        closeJMenuItem.addActionListener(this);
        aboutUsJMenuItem.addActionListener(this);
        girlJMenuItem.addActionListener(this);
        animalJMenuItem.addActionListener(this);
        sportJMenuItem.addActionListener(this);

        this.setJMenuBar(menuBar);
    }

    private void initArr() {
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            arr2[i / 4][i % 4] = arr[i];
        }
    }

    private void showJFrame() {
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
//        System.out.println(keyCode);
        if (victory()){
            System.out.println("胜利");
            return;
        }else if (keyCode == 81) {
//            System.out.println("显示原图");
            showImage();
        }
    }

    private void showImage() {
        this.getContentPane().removeAll();
        JLabel label = new JLabel(new ImageIcon(path+"\\all.jpg"));
        label.setBounds(83, 134, 420, 420);
        this.getContentPane().add(label);

        JLabel stepJLabel = new JLabel("步数："+ number);
        stepJLabel.setBounds(50,40,100,20);
        this.add(stepJLabel);

        ImageIcon bg = new ImageIcon("Game\\image\\background.png");
        JLabel background = new JLabel(bg);
        background.setBounds(40, 40, bg.getIconWidth(), bg.getIconHeight());
        this.getContentPane().add(background);


        this.getContentPane().repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (victory()){
            System.out.println("胜利");
            return;
        }else if (keyCode == 81) {
//            System.out.println("松开了W");
            initImage();
        }else if (keyCode == 38) {
//            System.out.println("向上移动");
            if (x<3) {
                arr2[x][y] = arr2[x+1][y];
                arr2[x+1][y] = 0;
                x++;
                number++;
                initImage();

            }else{
                System.out.println("不能再往上移动了");
            }

        }else if (keyCode == 37) {
//            System.out.println("向左移动");
            if (y<3) {
                arr2[x][y] = arr2[x][y+1];
                arr2[x][y+1] = 0;
                y++;
                number++;
                initImage();
            }else {
                System.out.println("不能再往左移动了");
            }
        }else if (keyCode == 39) {
//            System.out.println("向右移动");
            if (y>0) {
                arr2[x][y] = arr2[x][y-1];
                arr2[x][y-1] = 0;
                y--;
                number++;
                initImage();
            }else {
                System.out.println("不能再往右移动了");
            }
        }else if (keyCode == 40) {
//            System.out.println("向下移动");
            if (x>0) {
                arr2[x][y] = arr2[x-1][y];
                arr2[x-1][y] = 0;
                x--;
                number++;
                initImage();
            }else {
                System.out.println("不能再往下移动了");
            }
        }else if (keyCode == 87) {
            arr2 = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage();
        }
    }

    private boolean victory() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(win[i][j] != arr2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == replayJMenuItem){
            number = 0;
            initArr();
            initImage();
        } else if (source == reloginJMenuItem) {
            this.setVisible(false);
            new LoginJFrame();
        } else if (source == closeJMenuItem) {
            System.exit(0);
        }else if (source == aboutUsJMenuItem) {
            System.out.println("请联系我");
            JDialog aboutDialog = new JDialog();
            aboutDialog.setSize(350,350);
            JLabel aboutJLabel = new JLabel(new ImageIcon("Game\\image\\vx.jpg"));
            aboutJLabel.setBounds(0,0,200,150);
            aboutDialog.getContentPane().add(aboutJLabel);
            aboutDialog.setAlwaysOnTop(true);
            aboutDialog.setTitle("请添加我！");
            aboutDialog.setLocationRelativeTo(null);
            aboutDialog.setModal(true);
            aboutDialog.setVisible(true);
        } else if (source == girlJMenuItem) {
            Random random = new Random();
            path = "Game\\image\\girl\\girl"+ random.nextInt(12)+"\\";
            number = 0;
            initArr();
            initImage();
        } else if (source == animalJMenuItem) {
            Random random = new Random();
            path = "Game\\image\\animal\\animal"+ random.nextInt(7)+"\\";
            number = 0;
            initArr();
            initImage();
        }else if (source == sportJMenuItem) {
            Random random = new Random();
            path = "Game\\image\\sport\\sport"+ random.nextInt(9)+"\\";
            number = 0;
            initArr();
            initImage();
        }
    }
}
