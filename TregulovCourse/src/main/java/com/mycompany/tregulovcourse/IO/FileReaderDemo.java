/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class FileReaderDemo {

    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("rubai.txt");
            int result;
            while ((result = reader.read()) != -1) {
                System.out.print((char) result);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            try {
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
