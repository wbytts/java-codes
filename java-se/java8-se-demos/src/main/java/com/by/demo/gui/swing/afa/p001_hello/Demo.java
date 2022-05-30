package com.by.demo.gui.swing.afa.p001_hello;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        // 创建一个JFrame的对象, JFrame可以表示一个窗口
        // 传入一个参数的JFrame构造函数,表示了窗口的标题
        JFrame frame = new JFrame("Swing Example");

        // 设置当关闭窗口的时候,退出整个程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 设置窗口的大小
        frame.setSize(400, 300);
        // 设置窗口的标题
        frame.setTitle("改过的标题");

        // 设置窗口的可见性
        frame.setVisible(true);
    }
}
