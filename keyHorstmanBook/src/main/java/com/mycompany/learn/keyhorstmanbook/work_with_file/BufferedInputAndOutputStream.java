/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.work_with_file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
public class BufferedInputAndOutputStream {
    public static void main(String[] args) {
        try( BufferedInputStream inStr = new BufferedInputStream(new FileInputStream("bear.jpg"));
                BufferedOutputStream outStr = new BufferedOutputStream(new FileOutputStream("bear2.jpg"))){
            
            int result;
           while((result=inStr.read())!=-1){
               outStr.write(result);
           }
            System.out.println("Done!");         
                    
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(BufferedInputAndOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
