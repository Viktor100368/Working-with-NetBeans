/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO;

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
public class DataStreamsDemo {
    public static void main(String[] args) {
       try(DataOutputStream output = new DataOutputStream(new FileOutputStream("my_test1.bin"));
               DataInputStream input = new DataInputStream(new FileInputStream("my_test1.bin"));
               ){
           output.writeBoolean(true);
           output.writeChar('A');
           output.writeUTF("Hello");
           output.writeInt(1000000);
           System.out.println("boolean = "+input.readBoolean());
           System.out.println("character = "+input.readChar());
           System.out.println("UTF = "+input.readUTF());
           System.out.println("int = "+input.readInt());
           System.out.println("done!");
           
       } catch (IOException ex) {
            Logger.getLogger(DataStreamsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
