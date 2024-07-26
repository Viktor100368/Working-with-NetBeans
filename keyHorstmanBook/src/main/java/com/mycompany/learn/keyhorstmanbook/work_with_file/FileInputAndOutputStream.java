/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.work_with_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class FileInputAndOutputStream {
    public static void main(String[] args) {
        try(FileInputStream input = new FileInputStream("C:\\Users\\Victor\\Documents\\picture\\bear.jpg");
                FileOutputStream output = new FileOutputStream("bear.jpg")){
            int element;
            while((element=input.read())!=-1){
                output.write(element);
            }
            System.out.println("Done!");
        } catch (IOException ex) {
            Logger.getLogger(FileInputAndOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
