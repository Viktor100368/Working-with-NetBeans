/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Victor
 */
public class PathAndFilesDemo2 {
    public static void main(String[] args) throws IOException {
             Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Victor\\Documents\\M");
        Path directoryPath2 = Paths.get("C:\\Users\\Victor\\Documents\\B");
       // Files.copy(filePath, directoryPath.resolve(filePath),StandardCopyOption.REPLACE_EXISTING);
       // Files.copy(filePath, directoryPath.resolve("test16.txt"));
      // Files.copy(directoryPath2, directoryPath.resolve("B"));
      //Files.move(filePath,directoryPath.resolve("test15.txt"));
        //Files.move((Paths.get("test10.txt")),(Paths.get("test11.txt")));
        Files.delete(Paths.get("test5.txt"));
        System.out.println("done!");
       
    }
    
}
