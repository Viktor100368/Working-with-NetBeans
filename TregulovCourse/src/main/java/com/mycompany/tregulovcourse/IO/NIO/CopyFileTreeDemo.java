/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author Victor
 */
public class CopyFileTreeDemo {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\Victor\\Documents\\X");
        Path destination = Paths.get("C:\\Users\\Victor\\Documents\\CopyHere");
        Files.walkFileTree(source,new MyFileVisitor2(source,destination));
        
    }
    
}
class MyFileVisitor2 extends SimpleFileVisitor<Path>{
    private Path source;
    private Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

      
    
       @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination =destination.resolve( source.relativize(dir));
        Files.copy(dir, newDestination,StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination =destination.resolve( source.relativize(file));
        Files.copy(file, newDestination,StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

 
    
}