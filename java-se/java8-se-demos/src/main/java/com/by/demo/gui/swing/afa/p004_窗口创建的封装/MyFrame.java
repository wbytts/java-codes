package com.by.demo.gui.swing.afa.p004_窗口创建的封装;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel root = new JPanel();
        this.setContentPane(root);

        JButton button = new JButton("测试");
        root.add(button);

        // 创建一个标签组件
        JLabel label = new JLabel("你好啊!");
        root.add(label);

        this.setSize(400, 300);
        this.setTitle("改过的标题");
        this.setVisible(true);
    }
}
