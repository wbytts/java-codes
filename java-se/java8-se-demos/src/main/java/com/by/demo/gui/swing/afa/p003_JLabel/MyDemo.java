package com.by.demo.gui.swing.afa.p003_JLabel;

import javax.swing.*;

public class MyDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel root = new JPanel();
        frame.setContentPane(root);

        JButton button = new JButton("测试");
        root.add(button);

        // 创建一个标签组件
        JLabel label = new JLabel("你好啊!");
        root.add(label);


        frame.setSize(400, 300);
        frame.setTitle("改过的标题");
        frame.setVisible(true);
    }
}
