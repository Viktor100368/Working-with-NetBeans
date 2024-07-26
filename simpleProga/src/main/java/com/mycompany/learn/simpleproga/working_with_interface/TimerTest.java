/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.simpleproga.working_with_interface;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Victor
 */
public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimerPrinter();
        Timer t = new Timer(10000,listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit programm?");
        System.exit(0);
    }
}
class TimerPrinter implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is "+new Date());
        Toolkit.getDefaultToolkit().beep();
    }
    
}