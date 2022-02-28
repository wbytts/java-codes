package com.by.demo;

import cn.hutool.core.util.StrUtil;

public class Mmp {
    public static void main(String[] args) {
        String str = "100101";
        String result = StrUtil.padPre(str, 8, "0");
        System.out.println(result);
    }

    /*
     * 常用快捷键：
     * 找到所有的引用： Shift + F12
     * 同时修改本文件中所有匹配的： Ctrl+F12
     * 重命名：比如要修改一个方法名，可以选中后按 F2，输入新的名字，回车，会发现所有的文件都修改了
     * 跳转到下一个 Error 或 Warning：当有多个错误时可以按 F8 逐个跳转
     * 查看 diff： 在 explorer 里选择文件右键 Set file to compare，然后需要对比的文件上右键选择 Compare with
     * file_name_you_chose
     */
}
