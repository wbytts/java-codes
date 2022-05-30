package com.by.demo.gui.swing.afa.p005_事件处理.f3_Lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel root = new JPanel();
        this.setContentPane(root);

        JButton button = new JButton("测试");
        root.add(button);

        // 给按钮添加监听器
        button.addActionListener(e -> System.out.println("我被点击了!!!"));


        this.setSize(400, 300);
        this.setTitle("改过的标题");
        this.setVisible(true);
    }
}

