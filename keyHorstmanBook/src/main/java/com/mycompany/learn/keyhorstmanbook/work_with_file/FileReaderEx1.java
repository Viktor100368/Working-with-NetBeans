/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.work_with_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class FileReaderEx1 {
    public static void main(String[] args) {
      try(FileReader reader = new FileReader("C:\\Users\\Victor\\Documents\\NetBeansProjects\\keyHorstmanBook\\rubai2.txt")){
          int result ;
          while((result = reader.read())!= -1){
              System.out.print((char)result);
          }
      } catch (IOException ex) {
            Logger.getLogger(FileReaderEx1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
