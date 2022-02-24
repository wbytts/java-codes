package com.by.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

public class Demo_Lombox_01 {
    public static void main(String[] args) {
        Person p = new Person("张三", 18);
        System.out.println(p);
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person {
    String name;
    int age;
}

