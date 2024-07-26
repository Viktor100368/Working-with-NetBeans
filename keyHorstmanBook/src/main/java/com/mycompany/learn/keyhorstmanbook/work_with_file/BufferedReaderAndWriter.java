/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.work_with_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class BufferedReaderAndWriter {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\Victor\\Documents\\NetBeansProjects\\keyHorstmanBook\\rubai2.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("rubai3.txt"))){
            String str1=null;
            while((str1=reader.readLine())!=null){
                writer.write(str1);
            }
        } catch (IOException ex) {
            Logger.getLogger(BufferedReaderAndWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
