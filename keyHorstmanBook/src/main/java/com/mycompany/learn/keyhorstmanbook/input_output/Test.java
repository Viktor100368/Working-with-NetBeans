/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.input_output;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class Test {
    public static void main(String[] args){
        try(FileInputStream file = new FileInputStream("C:\\Users\\Victor\\Documents\\NetBeansProjects\\keyHorstmanBook\\data.txt");
                BufferedInputStream in = new BufferedInputStream(file);
                DataInputStream dataIn = new DataInputStream(in)){
            int x = dataIn.readInt();
            while(x!= -1){
                System.out.println(x);
                x = dataIn.readInt();
            }
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
