/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.shildt.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Victor
 */
public class SwingDemo {
    SwingDemo(){
        JFrame jfrm = new JFrame("A Simple Swing Program");
        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("Swing powers the modern Java GUI.");
        jfrm.getContentPane().add(jlab);
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new SwingDemo());
    }
}
