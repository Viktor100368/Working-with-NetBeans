/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO.NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Victor
 */
public class Test1 {

    public static void main(String[] args) throws IOException {
        Properties defaultProperties = new Properties();
        defaultProperties.setProperty("bla", "Hello dolly");
       Properties properties = new Properties(defaultProperties);
//       properties.setProperty("name", "Viltor");
//       properties.setProperty("age","44");
//       properties.setProperty("weight", "170");
//        System.out.println(properties.getProperty("name"));
//        FileOutputStream out = new FileOutputStream("my.properties");
//        properties.store(out, "my properties file");
        FileInputStream input = new FileInputStream("my.properties");
        FileInputStream inputSetup = new FileInputStream("setupFile.properties");
        properties.load(input);
      String name=properties.getProperty("name");
      int age = Integer.parseInt(properties.getProperty("age"));
      int weight = Integer.parseInt(properties.getProperty("weight"));
        System.out.println(name+" "+ age+ " "+weight);
        System.out.println(properties.getProperty("bla"));
        properties.load(inputSetup);
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("path"));
    }

}
