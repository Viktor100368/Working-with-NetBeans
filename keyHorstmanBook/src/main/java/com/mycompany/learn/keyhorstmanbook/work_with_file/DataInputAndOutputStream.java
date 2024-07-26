/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.work_with_file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class DataInputAndOutputStream {
    public static void main(String[] args) {
        try(
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data2.bin"));
                DataInputStream in = new DataInputStream(new FileInputStream("data2.bin"));){
            
            out.write(120);
            out.writeLong(344545333);
            out.writeDouble(2.718);
            System.out.println(in.readByte());
            System.out.println(in.readLong());
            System.out.println(in.readDouble());
            
        } catch (IOException ex) {
            Logger.getLogger(DataInputAndOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
