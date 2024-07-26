/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class TryWithResoursesDemo {
    public static void main(String[] args) {
        try( FileReader reader = new FileReader("C:\\Users\\Victor\\Documents\\TregulovCourse\\rubai.txt");
             FileWriter writer = new FileWriter("test1.txt")  ;
                ){
            int result;
            while((result = reader.read())!=-1){
                System.out.print((char)result);
                writer.write((char)result);
            }
            System.out.println("done!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
