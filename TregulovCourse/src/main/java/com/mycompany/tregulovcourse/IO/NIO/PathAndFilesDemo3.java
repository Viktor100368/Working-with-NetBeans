/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Victor
 */
public class PathAndFilesDemo3 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
        //  Files.createFile(filePath);
//        String dialog = "-Privet \n-Privet \n-kak dela\n-xorosho a u tebja\n-toje xorosho";
//        Files.write(filePath,dialog.getBytes());
        List<String> list = Files.readAllLines(filePath);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
