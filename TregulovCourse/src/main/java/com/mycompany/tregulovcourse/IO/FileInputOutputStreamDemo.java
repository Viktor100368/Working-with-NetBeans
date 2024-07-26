/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class FileInputOutputStreamDemo {

    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\Victor\\Documents\\picture\\wolf.jpg");
                FileOutputStream outputStream = new FileOutputStream("wolf.jpg")) {
            int temp;
            while((temp=inputStream.read())!=-1){
                outputStream.write(temp);
            }
            System.out.println("done!");

        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }
}
