/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO.NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author Victor
 */
public class DeleteDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Victor\\Documents\\X");
        Files.walkFileTree(path, new MyFileVisitor3());
        
    }
}
class MyFileVisitor3 extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("delete directory "+dir.getFileName());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("delete name "+file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }
    
}