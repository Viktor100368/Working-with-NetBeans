/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.work_with_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author Victor
 */
public class FileEx1 {
    public static void main(String[] args) {
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream("file1.bin"));
                DataInputStream in = new DataInputStream(new FileInputStream("file1.bin"))
                ){
            out.writeBoolean(false);
            out.writeByte(53);
            out.writeByte(99);
            out.writeDouble(3.14159);
            System.out.println("======================");
            System.out.println(in.readBoolean());
            System.out.println(in.readByte());
            System.out.println(in.readByte());
            System.out.println(in.readDouble());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileEx1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileEx1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
