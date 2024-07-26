/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Victor
 */
public class FileWriterDemo {

    public static void main(String[] args) {
        String rubai = "Много лет размыщлял я над жизнью земной."
                + "Непонятного нет для меня под луной."
                + "Мне известно, что мне ничего не известно!"
                + "Вот последняя правда открытая мной";
        String s="\nprivet";
        FileWriter writer = null;
        try {
            //writer = new FileWriter("C:/Users/Victor/Documents/TregulovCourse/rubai.txt");
            writer = new FileWriter("rubai.txt",true);
//            for(int i=0; i<rubai.length();i++){
//                writer.write(rubai.charAt(i));
//            }
            writer.write(s);
            System.out.println("done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                writer.close();
            } catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }

    }

}
