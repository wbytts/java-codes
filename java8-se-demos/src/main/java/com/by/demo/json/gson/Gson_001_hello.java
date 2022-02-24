package com.by.demo.json.gson;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Gson_001_hello {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Person p = new Person("张三", 18);
        String jsonStr = gson.toJson(p);
        System.out.println(jsonStr);
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person {
    String name;
    int age;
}