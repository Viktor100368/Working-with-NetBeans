/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
         try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Victor\\Documents\\TregulovCourse\\rubai.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test2.txt"))){
//             int result ;
//             while((result = reader.read())!=-1){
//                 writer.write(result);
//             }
        String str;
        while((str=reader.readLine())!=null){
            writer.write(str);
        }
             
         } catch (FileNotFoundException ex) {
             ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
