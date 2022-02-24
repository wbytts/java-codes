package com.by.demo.p00_test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\谁将会使用这台电脑？\\Downloads\\粮食配额申请20220111100403.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheetAt = wb.getSheetAt(0);
            if(sheetAt == null) {
                System.out.println("无此标签页");
                return;
            }
            int rowNum = sheetAt.getLastRowNum();
            int colNum = sheetAt.getRow(0).getLastCellNum();
            System.out.println("rowNum:" + rowNum + ", colNum:" + colNum);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
