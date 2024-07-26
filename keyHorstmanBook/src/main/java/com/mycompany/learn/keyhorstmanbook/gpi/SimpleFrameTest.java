/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.gpi;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Victor
 */
public class SimpleFrameTest {
    public static void main(String[] args) {
//        EventQueue.invokeLater(()->{
//         SimpleFrame frame = new SimpleFrame();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setVisible(true);
//        });
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                try {
                    JFrame frame = new SizedFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    Thread.sleep(3000);
                    frame.setExtendedState(Frame.MAXIMIZED_BOTH);
//                    Thread.sleep(3000);
//                    frame.setExtendedState(Frame.NORMAL);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SimpleFrameTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
        });
            
}
}
    class SizedFrame extends JFrame{
        
        
        public SizedFrame(){
            Toolkit kit = Toolkit.getDefaultToolkit();
            Dimension screenSize = kit.getScreenSize();
            int screenHeight = screenSize.height;
            int screenWidth = screenSize.width;
            setSize(screenWidth/2,screenHeight/2);
            setLocationByPlatform(true);
//            Image img = new ImageIcon("icon.gif").getImage();
//            setIconImage(img);
            
        }
    }
