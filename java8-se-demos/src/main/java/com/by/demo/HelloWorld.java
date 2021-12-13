package com.by.demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class HelloWorld {
    public static void main(String[] args) throws IOException {
        // Runtime.getRuntime().exec("chcp 65001");
        String jsonFile = "D:/projects/java-codes/java8-se-demos/src/test/java/a.json";
        File file = new File(jsonFile);
        System.out.println(file.getAbsolutePath());
        FileReader reader = new FileReader(new File(jsonFile));
        char[] buf = new char[1024 * 64];
        reader.read(buf);
        String jsonStr = new String(buf);
        jsonStr = jsonStr.trim();

        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonStr);
        String dataStr = jsonNode.get("data").asText();

        System.out.println(jsonNode);

        reader.close();
    }
}
