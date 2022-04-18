package com.by.temp.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) {
        String str = "bsajkdaljdlkajwiboadcianoefjieaofej";
        RobotStatus robotStatus = new RobotStatus();
        robotStatus.readStatusFromDevice();
    }
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface At {
    int value();
}

class RobotStatus {
    @At(0) // 通过自定义注解指定此属性对应哪个位数
    private String attr1;
    @At(1)
    private String attr2;
    @At(5)
    private String attr3;

    // 从外部读取数据，按照At注解标注的位数写入RobotStatus对象
    public void readStatusFromDevice(/*传入数据源*/) {
        Class<? extends RobotStatus> myClass = this.getClass();
        Field[] myFields = myClass.getDeclaredFields(); // 获取当前对象的所有字段
        for (Field field : myFields) {
            At anno = field.getDeclaredAnnotation(At.class);// 获取这个字段的指定注解
            // 根据注解信息set数据
            System.out.println(field.getName() + "对应的位数是：" + anno.value());
        }
    }
}