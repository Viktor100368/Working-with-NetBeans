/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.work_with_file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class FileWriterEx1 {
    public static void main(String[] args){
        String rubai ="Много лет размыщлял я над жизнью земной."
                + "Непонятного нет для меня под луной."
                + "Мне известно, что мне ничего не известно!"
                + "Вот последняя правда открытая мной";
        String str2 = "hello dolly";
        try(FileWriter writer = new FileWriter("rubai2.txt",true)){
            writer.write(str2);
            
            System.out.println("Done!");
        } catch (IOException ex) {
            Logger.getLogger(FileWriterEx1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
