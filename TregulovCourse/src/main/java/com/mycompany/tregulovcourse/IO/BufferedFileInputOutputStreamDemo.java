/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class BufferedFileInputOutputStreamDemo {

    public static void main(String[] args) {
        try (BufferedInputStream fileInput = new BufferedInputStream(new FileInputStream(
                "C:\\Users\\Victor\\Documents\\picture\\wolf.jpg"));
                BufferedOutputStream fileOutput = new BufferedOutputStream(
                        new FileOutputStream("wolf2.jpg"))) {
            int buff;
            while ((buff = fileInput.read()) != -1) {
                fileOutput.write(buff);
            }
            System.out.println("done!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
