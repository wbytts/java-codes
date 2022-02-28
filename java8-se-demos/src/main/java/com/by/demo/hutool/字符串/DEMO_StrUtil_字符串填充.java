package com.by.demo.hutool.字符串;

import cn.hutool.core.util.StrUtil;

public class DEMO_StrUtil_字符串填充 {

    public static void main(String[] args) {

        /*
            StrUtil.padPre 是在字符串前面填充
            StrUtil.padAfter 是在字符串后面填充
        */

        String str = "100101";
        String result = StrUtil.padPre(str, 8, "0");
        System.out.println(result);
    }

}
