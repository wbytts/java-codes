package com.by.demo.json.gson;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

public class Gson_001_hello {

    @Test
    public void test01(String[] args) {
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




