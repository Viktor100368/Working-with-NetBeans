/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test10.txt","rw")
                ){
            int a = file.read();
            System.out.println((char)a);
            String str = file.readLine();
            System.out.println(str);
            file.seek(101);
            String str2 = file.readLine();
            System.out.println(str2);
//            file.seek(0);
//            file.writeBytes("privet");
            file.seek(file.length()-1);
            file.writeBytes("\n\t\t\t\tWilliam Butler Yeats");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RandomAccessFileDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RandomAccessFileDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
