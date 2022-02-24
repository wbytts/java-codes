package com.by.demo.P00_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RunSysCommandDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime run = Runtime.getRuntime();
        Process p = run.exec("ping 127.0.0.1");
        // Process p = run.exec("chcp");
        // 读取命令的输出信息
        InputStream is = p.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        p.waitFor();
        if (p.exitValue() != 0) {
            // 说明命令执行失败
            // 可以进入到错误处理步骤中
        }

        // 打印输出信息
        String s = null;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }
    }
}
