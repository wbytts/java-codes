package com.by.demo.hutool;

import cn.hutool.core.util.StrUtil;

public class HT_0001 {
    public static void main(String[] args) {
        System.out.println(StrUtil.isBlank(""));
        System.out.println(StrUtil.isBlank("   "));
        System.out.println(StrUtil.isBlank("\n"));
        System.out.println(StrUtil.isBlank(null));
        System.out.println(StrUtil.isBlank("123"));
    }
}
