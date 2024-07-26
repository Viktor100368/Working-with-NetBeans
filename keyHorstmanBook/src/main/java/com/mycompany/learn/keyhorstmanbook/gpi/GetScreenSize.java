/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.gpi;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
/**
 *
 * @author Victor
 */
public class GetScreenSize {
    public static void main(String[] args) throws IOException {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        System.out.println(screenWidth+" "+screenHeight);
    
      
    }
}
